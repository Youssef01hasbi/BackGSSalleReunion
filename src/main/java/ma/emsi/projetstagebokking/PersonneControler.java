package ma.emsi.projetstagebokking;

import ma.emsi.projetstagebokking.Service.PersonneService;
import ma.emsi.projetstagebokking.entites.Personne;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personne")
public class PersonneControler {
    private final PersonneService personneService;

    public PersonneControler(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Personne>> getAllPeronne(){
        List<Personne> personnes = personneService.findAllPersonne();
        return new ResponseEntity<>(personnes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Personne> getPeronneById(@PathVariable("id") Long id){
        Personne personne = personneService.findPersonneById(id);
        return new ResponseEntity<>(personne, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Personne> addPersonne(@RequestBody Personne personne){
        Personne newPersonne=personneService.addPersonne(personne);
        return new ResponseEntity<>(newPersonne,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Personne> updatePersonne(@RequestBody Personne personne){
        Personne updatePersonne1=personneService.updatePersonne(personne);
        return new ResponseEntity<>(updatePersonne1,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersonne(@PathVariable("id") Long id){
        personneService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
