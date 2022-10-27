package ma.emsi.projetstagebokking.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationSalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dateDebut;
    private String dateFin;
    private String heureDebut;
    private String heureFin;
    private String desscription;
    private Long nbrJourReserve;
    @ManyToOne
    private SalleReunion salleReunion;
    @OneToMany(mappedBy = "reservationSalle",fetch = FetchType.LAZY)
    private Collection<Personne> personnesInvite;
    @OneToOne
    private Personne personnePlanifie;
    @OneToOne
    private Personne personneInviter;

}
