package ma.emsi.projetstagebokking.repositories;

import ma.emsi.projetstagebokking.entites.SalleReunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface SalleReunionRepository extends JpaRepository<SalleReunion,Long> {

    SalleReunion findSalleReunionById(Long id);
}
