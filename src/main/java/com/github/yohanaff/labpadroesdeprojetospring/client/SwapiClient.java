package com.github.yohanaff.labpadroesdeprojetospring.client;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "swapi", url = "https://swapi.dev/api")
public interface SwapiClient {

    @GetMapping("/people/{id}/")
    PeopleDTO getPerson(@PathVariable("id") int id);
}
