package com.github.yohanaff.labpadroesdeprojetospring.controller;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetRequestDTO;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetResponseDTO;
import com.github.yohanaff.labpadroesdeprojetospring.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping
    public ResponseEntity<List<PlanetResponseDTO>> getAllPlanets() {
        return ResponseEntity.ok((List<PlanetResponseDTO>) planetService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanetResponseDTO> getPlanetById(@PathVariable Long id) {
        PlanetResponseDTO planetResponseDTO = planetService.findById(id);
        if (planetResponseDTO != null) {
            return ResponseEntity.ok(planetResponseDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> addPlanet(@RequestBody PlanetRequestDTO planetRequestDTO) {
        planetService.insert(planetRequestDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePlanet(@PathVariable Long id, @RequestBody PlanetRequestDTO planetRequestDTO) {
        planetService.update(id, planetRequestDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlanet(@PathVariable Long id) {
        planetService.delete(id);
        return ResponseEntity.ok().build();
    }
}
