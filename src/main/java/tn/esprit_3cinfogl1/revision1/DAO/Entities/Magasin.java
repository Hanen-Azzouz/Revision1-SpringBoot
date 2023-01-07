package tn.esprit_3cinfogl1.revision1.DAO.Entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

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

public class Magasin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMagasin;
    private String nomMagasin;
    private String adresseMagasin;
    private long contactMagasin;


    /*Child premiere relation
    @OneToOne(mappedby="shop")
    private Personnel director;

    //child deuxieme relation (cardinalite la plus faible)
    @OneToMany(mappedby="magasin")
    private List<Personnel> cashiers;

    //child troisieme relation
    @ManyToMany(mappedby="manyShops")
    private List<Client> manyClients;*/




}
