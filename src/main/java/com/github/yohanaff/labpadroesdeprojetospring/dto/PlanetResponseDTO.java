package com.github.yohanaff.labpadroesdeprojetospring.dto;

import java.util.List;

public record PlanetResponseDTO(
        String name,
        Long population,
        List<PeopleDTO> residents
) {
}
