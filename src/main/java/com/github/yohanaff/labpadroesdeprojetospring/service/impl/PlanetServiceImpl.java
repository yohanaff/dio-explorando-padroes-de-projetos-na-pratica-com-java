package com.github.yohanaff.labpadroesdeprojetospring.service.impl;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetDTO;
import com.github.yohanaff.labpadroesdeprojetospring.service.PlanetService;
import org.springframework.stereotype.Service;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Override
    public Iterable<PlanetDTO> findAll() {
        return null;
    }

    @Override
    public PlanetDTO findById(Long id) {
        return null;
    }

    @Override
    public void insert(PlanetDTO planetDTO) {

    }

    @Override
    public void update(PlanetDTO planetDTO) {

    }

    @Override
    public void delete(Long id) {

    }
}
