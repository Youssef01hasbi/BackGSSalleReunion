package ma.emsi.projetstagebokking.Service;

import ma.emsi.projetstagebokking.entites.ReservationSalle;
import ma.emsi.projetstagebokking.repositories.ReservationSalleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationSalleService {
    private final ReservationSalleRepo reservationSalleRepo;

    @Autowired
    public ReservationSalleService(ReservationSalleRepo reservationSalleRepo) {
        this.reservationSalleRepo = reservationSalleRepo;
    }

    public ReservationSalle addReservationSalle(ReservationSalle reservationSalle){
        return reservationSalleRepo.save(reservationSalle);
    }

    public List<ReservationSalle> findAllReservationSalle(){
        return reservationSalleRepo.findAll();
    }

    public ReservationSalle updateReservationSalle(ReservationSalle reservationSalle){
        return reservationSalleRepo.save(reservationSalle);
    }

    public ReservationSalle findReservationSalleById(Long id){
        return reservationSalleRepo.findReservationSalleById(id);
    }

    public void deleteReservationSalleById(Long id){
        reservationSalleRepo.deleteById(id);
    }


}
