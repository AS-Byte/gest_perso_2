package tn.esprit.spring.DAO.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Magasin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMagasin;

    String nomMagasin;

    String adresseMagasin;

    long contactMagasin;

    @JsonIgnore
    @ManyToMany(mappedBy = "magasins")
    private List<Client> clients;


    @OneToOne(mappedBy = "dirmag")
    private Personnel directeur;


    @OneToMany (mappedBy = "permag")
    private List<Personnel> caissiers;

}
