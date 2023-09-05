package com.github.yohanaff.labpadroesdeprojetospring.dto;

import java.util.List;

public record PlanetRequestDTO(String name, Long population, List<Long> residentIds) {
}
