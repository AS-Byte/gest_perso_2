package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.CarteFid;


@Repository


public interface CarteFidRepo extends CrudRepository <CarteFid, Integer> {
}
