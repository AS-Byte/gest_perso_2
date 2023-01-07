package tn.esprit.spring.DAO.Entities;

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
public class CarteFid implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCarte;

    @Column(unique = true)
    long numeroCarte;

    long solde;

    @Temporal(TemporalType.DATE)
    Date dateCreation;
}
