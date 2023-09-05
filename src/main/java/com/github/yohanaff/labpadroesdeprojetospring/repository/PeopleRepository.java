package com.github.yohanaff.labpadroesdeprojetospring.repository;

import com.github.yohanaff.labpadroesdeprojetospring.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<People, Long> {

}
