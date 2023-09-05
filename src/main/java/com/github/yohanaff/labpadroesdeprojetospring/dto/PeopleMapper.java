package com.github.yohanaff.labpadroesdeprojetospring.dto;

import com.github.yohanaff.labpadroesdeprojetospring.model.People;

public class PeopleMapper {
    public static PeopleDTO fromEntity(People people) {
        return new PeopleDTO(
                people.getId(),
                people.getName(),
                people.getHeight(),
                people.getMass(),
                people.getHairColor(),
                people.getSkinColor(),
                people.getEyeColor(),
                people.getBirthYear(),
                people.getGender(),
                people.getHomeworld(),
                people.getFilms(),
                people.getSpecies(),
                people.getVehicles(),
                people.getStarships(),
                people.getCreated(),
                people.getEdited(),
                people.getUrl()
        );
    }
}