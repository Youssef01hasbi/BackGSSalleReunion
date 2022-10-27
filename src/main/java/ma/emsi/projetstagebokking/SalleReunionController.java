package ma.emsi.projetstagebokking;


import ma.emsi.projetstagebokking.Service.SalleReunionService;
import ma.emsi.projetstagebokking.entites.SalleReunion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SalleReunion")
public class SalleReunionController {

    private final SalleReunionService salleReunionService;

    @Autowired
    public SalleReunionController(SalleReunionService salleReunionService) {
        this.salleReunionService = salleReunionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SalleReunion>> getAllSalleReunion() {
        List<SalleReunion> salleReunions = salleReunionService.findAllSalleReunion();
        return new ResponseEntity<>(salleReunions, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<SalleReunion> findSalleReunionById(@PathVariable("id") Long id) {
        SalleReunion salleReunion = salleReunionService.findSalleReunionById(id);
        return new ResponseEntity<>(salleReunion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SalleReunion> addSalleReunion(@RequestBody SalleReunion salleReunion) {
        SalleReunion newSalleReunion = salleReunionService.addSalleReunion(salleReunion);
        return new ResponseEntity<>(newSalleReunion, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<SalleReunion> updateSalleReunion(@RequestBody SalleReunion salleReunion) {
        SalleReunion updateSalleReunion = salleReunionService.updateSalleReunion(salleReunion);
        return new ResponseEntity<>(updateSalleReunion, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteSalleReunionId(@PathVariable("id") Long id){
        salleReunionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
