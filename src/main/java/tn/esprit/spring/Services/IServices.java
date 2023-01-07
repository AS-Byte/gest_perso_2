package tn.esprit.spring.Services;


import tn.esprit.spring.DAO.Entities.Client;
import tn.esprit.spring.DAO.Entities.Magasin;

public interface IServices {
    Client ajouterClient(Client c);
    Magasin ajouterMagasinEtPersonnels(Magasin magasin) ;
}
