package com.github.yohanaff.labpadroesdeprojetospring.repository;

import com.github.yohanaff.labpadroesdeprojetospring.model.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
