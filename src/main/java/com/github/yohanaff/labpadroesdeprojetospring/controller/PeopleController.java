package com.github.yohanaff.labpadroesdeprojetospring.controller;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import com.github.yohanaff.labpadroesdeprojetospring.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/people/{id}")
    public PeopleDTO getPerson(@PathVariable int id) {
        return peopleService.getPerson(id);
    }
}