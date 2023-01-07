package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Magasin;

@Repository


public interface MagasinRepo extends CrudRepository <Magasin, Integer> {
}
