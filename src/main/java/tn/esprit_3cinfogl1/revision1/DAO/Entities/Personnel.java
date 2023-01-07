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

public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonnel;
    private String nomPersonnel;
    private String prenomPersonnel;
    private String adressePersonnel;

    @Temporal(TemporalType.DATE)
    private Date dateNaissanceP;

    @Enumerated(EnumType.STRING)//chaine de caracteres
    private TypePersonnel typePersonnel;

    /*Parent premiere relation
      @OneToOne
      private Magasin shop;

     //Parent deuxieme relation (cardinalite la plus forte)
        @ManyToOne
       private Magasin magasin;*/



}
