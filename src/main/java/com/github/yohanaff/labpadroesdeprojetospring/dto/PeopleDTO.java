package com.github.yohanaff.labpadroesdeprojetospring.dto;

import java.util.List;

public record PeopleDTO(
        Long id,
        String name,
        String height,
        String mass,
        String hairColor,
        String skinColor,
        String eyeColor,
        String birthYear,
        String gender,
        String homeworld,
        List<String> films,
        List<String> species,
        List<String> vehicles,
        List<String> starships,
        String created,
        String edited,
        String url) {
}