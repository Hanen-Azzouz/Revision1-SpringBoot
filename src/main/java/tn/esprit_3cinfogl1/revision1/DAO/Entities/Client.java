package tn.esprit_3cinfogl1.revision1.DAO.Entities;


import lombok.*;

import javax.persistence.*;

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



public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;
    @Column(unique = true)
    private long cin;

    /*Parent troisieme relation avec Magasin
     @ManyToMany
     private List<Magasin> manyShops;
    // Parent quatrieme relation avec CarteFid
     @OneToOne
      private CarteFid fidelite;*/


}
