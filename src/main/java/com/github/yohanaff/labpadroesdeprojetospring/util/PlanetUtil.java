package com.github.yohanaff.labpadroesdeprojetospring.util;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import com.github.yohanaff.labpadroesdeprojetospring.model.People;

public class PlanetUtil {
    public static People convertDTOToEntity(PeopleDTO peopleDTO) {
        People people = new People();
        people.setName(peopleDTO.name());
        people.setHeight(peopleDTO.height());
        people.setMass(peopleDTO.mass());
        people.setHairColor(peopleDTO.hairColor());
        people.setSkinColor(peopleDTO.skinColor());
        people.setEyeColor(peopleDTO.eyeColor());
        people.setBirthYear(peopleDTO.birthYear());
        people.setGender(peopleDTO.gender());
        people.setHomeworld(peopleDTO.homeworld());
        people.setFilms(peopleDTO.films());
        people.setSpecies(peopleDTO.species());
        people.setVehicles(peopleDTO.vehicles());
        people.setStarships(peopleDTO.starships());
        people.setCreated(peopleDTO.created());
        people.setEdited(peopleDTO.edited());
        people.setUrl(peopleDTO.url());
        return people;
    }
}
