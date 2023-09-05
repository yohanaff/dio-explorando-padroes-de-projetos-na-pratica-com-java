package com.github.yohanaff.labpadroesdeprojetospring.service;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetDTO;

/**
 * Interface that defines the <b>Strategy</b> pattern in the planet domain. With
 * that, if necessary, we can have multiple implementations of the same interface.
 *
 * @author yohanaff
 */
public interface PlanetService {
    Iterable<PlanetDTO> findAll();
    PlanetDTO findById(Long id);
    void insert(PlanetDTO planetDTO);
    void update(Long id, PlanetDTO planetDTO);
    void delete(Long id);
}
