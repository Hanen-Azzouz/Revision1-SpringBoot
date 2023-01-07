package tn.esprit_3cinfogl1.revision1.DAO.Entities;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor//constructeur par defaut
@AllArgsConstructor//constructeur paramétré
//@RequiredArgsConstructor//on a le droit a un seul constructeur personnalise
@Builder//pour un constructeur paramétré personnalisé à utiliser lors de l'instanciation

//@FieldDefaults(Level=AccessLevel.PRIVATE)

public class CarteFid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int idCarte;
    private long numeroCarte;
    private long solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
}
