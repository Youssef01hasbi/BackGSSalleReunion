package ma.emsi.projetstagebokking.repositories;

import ma.emsi.projetstagebokking.entites.ReservationSalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationSalleRepo extends JpaRepository<ReservationSalle,Long> {

    ReservationSalle findReservationSalleById(Long id);
}
