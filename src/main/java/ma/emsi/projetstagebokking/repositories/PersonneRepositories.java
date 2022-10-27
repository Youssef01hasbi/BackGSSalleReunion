package ma.emsi.projetstagebokking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.projetstagebokking.entites.Personne;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin("*")
public interface PersonneRepositories extends JpaRepository<Personne,Long> {
    Optional<Personne> findPersonneById(Long id);
}
