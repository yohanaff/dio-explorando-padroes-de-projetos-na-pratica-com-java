package com.github.yohanaff.labpadroesdeprojetospring.dto;

import java.util.List;

public record PlanetDTO(
        String name,
        String rotationPeriod,
        String orbitalPeriod,
        String diameter,
        String climate,
        String gravity,
        String terrain,
        String surfaceWater,
        String population,
        List<String> residents,
        List<String> films,
        String created,
        String edited,
        String url
) {
}
