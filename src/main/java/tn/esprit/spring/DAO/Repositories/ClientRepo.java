package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Client;

@Repository


public interface ClientRepo extends CrudRepository <Client, Integer> {
}
