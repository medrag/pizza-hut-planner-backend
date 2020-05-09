package fr.ph.planner.controller;

import fr.ph.planner.model.Magasin;
import fr.ph.planner.service.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magasins")
public class MagasinController {

    @Autowired
    private MagasinService magasinService;

    @GetMapping
    public ResponseEntity<List<Magasin>> getMagasins() {
        return ResponseEntity.ok(this.magasinService.getMagasinsList());
    }

    @PostMapping("/ajouter")
    public ResponseEntity<Magasin> addMagasin(@RequestBody Magasin magasin) {
        return ResponseEntity.ok(this.magasinService.addMagasin(magasin));
    }

    @PutMapping("/modifier")
    public ResponseEntity<Magasin> editMagasin(@RequestBody Magasin magasin) {
        return ResponseEntity.ok(this.magasinService.editMagasin(magasin));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMagasin(@PathVariable Long id) {
        this.magasinService.deleteMagasin(id);
        return ResponseEntity.noContent().build();
    }
}
