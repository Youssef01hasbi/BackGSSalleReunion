package ma.emsi.projetstagebokking.Service;

import ma.emsi.projetstagebokking.Exception.UserNotFoundException;
import ma.emsi.projetstagebokking.entites.Personne;
import ma.emsi.projetstagebokking.repositories.PersonneRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class PersonneService {
    private final PersonneRepositories personneRepositories;

    @Autowired
    public PersonneService(PersonneRepositories personneRepositories) {
        this.personneRepositories = personneRepositories;
    }

    public Personne addPersonne(Personne personne){
        personne.setEmployeeCode(UUID.randomUUID().toString());
        return personneRepositories.save(personne);
    }

    public List<Personne> findAllPersonne(){
        return personneRepositories.findAll();
    }

    public Personne updatePersonne(Personne personne){
        return personneRepositories.save(personne);
    }

    public Personne findPersonneById(Long id){
        return personneRepositories.findPersonneById(id)
                .orElseThrow(() ->new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteById(Long id) {
        personneRepositories.deleteById(id);
    }
}
