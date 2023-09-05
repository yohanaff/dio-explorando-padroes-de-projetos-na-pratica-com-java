package com.github.yohanaff.labpadroesdeprojetospring.service.impl;

import com.github.yohanaff.labpadroesdeprojetospring.client.SwapiClient;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetResponseDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetRequestDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleMapper;
import com.github.yohanaff.labpadroesdeprojetospring.model.People;
import com.github.yohanaff.labpadroesdeprojetospring.model.Planet;
import com.github.yohanaff.labpadroesdeprojetospring.repository.PeopleRepository;
import com.github.yohanaff.labpadroesdeprojetospring.repository.PlanetRepository;
import com.github.yohanaff.labpadroesdeprojetospring.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.github.yohanaff.labpadroesdeprojetospring.util.PlanetUtil.convertDTOToEntity;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private SwapiClient swapiClient;

    @Override
    public Iterable<PlanetResponseDTO> findAll() {
        List<PlanetResponseDTO> planetDTOList = new ArrayList<>();
        for (Planet planet : planetRepository.findAll()) {
            List<People> residents = (List<People>) peopleRepository.findAllById(planet.getResidentIds());
            List<PeopleDTO> residentDTOs = residents.stream()
                    .map(PeopleMapper::fromEntity)
                    .collect(Collectors.toList());
            planetDTOList.add(new PlanetResponseDTO(
                    planet.getName(),
                    planet.getPopulation(),
                    residentDTOs
            ));
        }
        return planetDTOList;
    }

    @Override
    public PlanetResponseDTO findById(Long id) {
        Optional<Planet> planet = planetRepository.findById(id);
        return planet.map(value -> {
            List<People> residents = (List<People>) peopleRepository.findAllById(value.getResidentIds());
            List<PeopleDTO> residentDTOs = residents.stream()
                    .map(PeopleMapper::fromEntity)
                    .collect(Collectors.toList());
            return new PlanetResponseDTO(
                    value.getName(),
                    value.getPopulation(),
                    residentDTOs
            );
        }).orElse(null);
    }

    @Override
    public void insert(PlanetRequestDTO planetRequestDTO) {
        Planet planet = new Planet();
        planet.setName(planetRequestDTO.name());
        planet.setPopulation(planetRequestDTO.population());

        List<Long> residentIds = planetRequestDTO.residentIds();

        planet.setResidentIds(residentIds);
        planetRepository.save(planet);
    }

    @Override
    public void update(Long id, PlanetRequestDTO planetRequestDTO) {
        Optional<Planet> existingPlanet = planetRepository.findById(id);
        if (existingPlanet.isPresent()) {
            Planet planet = existingPlanet.get();
            planet.setName(planetRequestDTO.name());
            planet.setPopulation(planetRequestDTO.population());

            List<Long> residentIds = planetRequestDTO.residentIds();
            planet.setResidentIds(residentIds);

            planetRepository.save(planet);
        }
    }

    @Override
    public void delete(Long id) {
        planetRepository.deleteById(id);
    }
}
