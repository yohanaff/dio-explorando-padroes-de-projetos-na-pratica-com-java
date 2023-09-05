package com.github.yohanaff.labpadroesdeprojetospring.controller;

import com.github.yohanaff.labpadroesdeprojetospring.dto.PlanetDTO;
import com.github.yohanaff.labpadroesdeprojetospring.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This {@link RestController} acts as our <b>Facade</b>, as it abstracts all the
 * complexity of integrations (H2 Database and ViaCEP API) into a simple and cohesive
 * interface (REST API).
 *
 * @author yohanaff
 */

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping
    public ResponseEntity<List<PlanetDTO>> getAllPlanets() {
        return ResponseEntity.ok((List<PlanetDTO>) planetService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanetDTO> getPlanetById(@PathVariable Long id) {
        PlanetDTO planetDTO = planetService.findById(id);
        if (planetDTO != null) {
            return ResponseEntity.ok(planetDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> addPlanet(@RequestBody PlanetDTO planetDTO) {
        planetService.insert(planetDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePlanet(@PathVariable Long id, @RequestBody PlanetDTO planetDTO) {
        planetService.update(id, planetDTO);  // Assuming you've changed the update method signature
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlanet(@PathVariable Long id) {
        planetService.delete(id);
        return ResponseEntity.ok().build();
    }
}
