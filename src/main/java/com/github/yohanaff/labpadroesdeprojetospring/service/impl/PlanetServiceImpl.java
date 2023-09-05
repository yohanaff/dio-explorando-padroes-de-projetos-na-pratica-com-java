package com.github.yohanaff.labpadroesdeprojetospring.service.impl;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetDTO;
import com.github.yohanaff.labpadroesdeprojetospring.model.Planet;
import com.github.yohanaff.labpadroesdeprojetospring.repository.PlanetRepository;
import com.github.yohanaff.labpadroesdeprojetospring.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    @Override
    public Iterable<PlanetDTO> findAll() {
        List<PlanetDTO> planetDTOList = new ArrayList<>();
        for (Planet planet : planetRepository.findAll()) {
            planetDTOList.add(new PlanetDTO(
                    planet.getName(),
                    planet.getPopulation()

            ));
        }
        return planetDTOList;
    }

    @Override
    public PlanetDTO findById(Long id) {
        Optional<Planet> planet = planetRepository.findById(id);
        return planet.map(value -> new PlanetDTO(
                value.getName(),
                value.getPopulation()
        )).orElse(null);
    }

    @Override
    public void insert(PlanetDTO planetDTO) {
        Planet planet = new Planet();
        planet.setName(planetDTO.name());
        planetRepository.save(planet);
    }

    @Override
    public void update(Long id, PlanetDTO planetDTO) {
        Optional<Planet> existingPlanet = planetRepository.findById(id);
        if (existingPlanet.isPresent()) {
            Planet planet = existingPlanet.get();
            planet.setName(planetDTO.name());
            planetRepository.save(planet);
        }
    }

    @Override
    public void delete(Long id) {
        planetRepository.deleteById(id);
    }
}
