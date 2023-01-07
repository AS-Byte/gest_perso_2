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

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idClient;

    String nomClient;

    String prenomClient;

    String adresseClient;

    @Column(unique = true)
    long cin;

    @JsonIgnore
    @OneToOne
    private CarteFid cartefid;

    @JsonIgnore
    @ManyToMany
    private List<Magasin> magasins;




}
