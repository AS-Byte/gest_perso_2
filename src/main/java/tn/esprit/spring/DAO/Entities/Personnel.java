package tn.esprit.spring.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)


public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPersonnel;

    String nomPersonnel;

    String prenomPersonnel;

    @Temporal(TemporalType.DATE)
    Date dateNaissanceP;

    @Enumerated(EnumType.STRING)
    TypePersonnel typePersonel;

    @JsonIgnore
    @OneToOne
    private  Magasin dirmag;

    @JsonIgnore
    @ManyToOne
    Magasin permag;



}
