package ma.emsi.projetstagebokking.repositories;

import ma.emsi.projetstagebokking.entites.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface JobsRepository extends JpaRepository<Jobs,Long> {

    Jobs findJobsById(Long id);
}
