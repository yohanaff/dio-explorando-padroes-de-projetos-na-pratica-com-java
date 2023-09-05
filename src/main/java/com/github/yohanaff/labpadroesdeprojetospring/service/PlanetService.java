package com.github.yohanaff.labpadroesdeprojetospring.service;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetRequestDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetResponseDTO;

/**
 * Interface that defines the <b>Strategy</b> pattern in the planet domain. With
 * that, if necessary, we can have multiple implementations of the same interface.
 *
 * @author yohanaff
 */
public interface PlanetService {
    Iterable<PlanetResponseDTO> findAll();

    PlanetResponseDTO findById(Long id);

    void insert(PlanetRequestDTO planetRequestDTO);

    void update(Long id, PlanetRequestDTO planetRequestDTO);

    void delete(Long id);
}
