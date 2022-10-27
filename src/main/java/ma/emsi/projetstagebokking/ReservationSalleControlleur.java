package ma.emsi.projetstagebokking;

import ma.emsi.projetstagebokking.Service.ReservationSalleService;

import ma.emsi.projetstagebokking.entites.ReservationSalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ReservationSalle")
public class ReservationSalleControlleur {
    private final ReservationSalleService reservationSalleService;

    @Autowired
    public ReservationSalleControlleur(ReservationSalleService reservationSalleService) {
        this.reservationSalleService = reservationSalleService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<ReservationSalle>> getAllReservationSalle(){
        List<ReservationSalle> reservationSalle = reservationSalleService.findAllReservationSalle();
        return new ResponseEntity<>(reservationSalle, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ReservationSalle> getReservationSalleById(@PathVariable("id") Long id){
        ReservationSalle reservationSalle=reservationSalleService.findReservationSalleById(id);
        return new ResponseEntity<>(reservationSalle,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ReservationSalle> addReservationSalle(@RequestBody ReservationSalle reservationSalle){
        ReservationSalle newReservationSalle = reservationSalleService.addReservationSalle(reservationSalle);
        return new ResponseEntity<>(newReservationSalle,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ReservationSalle> updateReservationSalle(@RequestBody ReservationSalle reservationSalle){
        ReservationSalle updateReservationSalle = reservationSalleService.updateReservationSalle(reservationSalle);
        return new ResponseEntity<>(updateReservationSalle,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReservationSalle(@PathVariable("id") Long id){
        reservationSalleService.deleteReservationSalleById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
