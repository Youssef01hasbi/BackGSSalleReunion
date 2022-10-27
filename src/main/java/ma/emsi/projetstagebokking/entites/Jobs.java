package ma.emsi.projetstagebokking.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Jobs implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nom;
    private String salary;
    @OneToMany(mappedBy = "job",fetch = FetchType.LAZY)
    private Collection<Personne> personnes;
}
