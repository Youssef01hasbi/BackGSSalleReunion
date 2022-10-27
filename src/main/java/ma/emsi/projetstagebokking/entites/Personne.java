package ma.emsi.projetstagebokking.entites;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Personne implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String jobTitle;
    private String role;
    private String imageUrl;
    private String mdp;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
    @ManyToOne
    private Jobs job;
    @ManyToOne
    private Department department;
    @ManyToOne
    private ReservationSalle reservationSalle;
}
