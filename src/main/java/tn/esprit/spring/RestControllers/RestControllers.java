package tn.esprit.spring.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.DAO.Entities.Client;
import tn.esprit.spring.DAO.Entities.Magasin;
import tn.esprit.spring.Services.IServices;

@RestController
public class RestControllers {
    @Autowired
    IServices is;

    @PostMapping("ajouterClient")
    public Client ajouterClient( @RequestBody Client c){ return is.ajouterClient(c);}

    @PostMapping("ajouterMagasinEtPersonnels")
    public Magasin ajouterMagasinEtPersonnels( @RequestBody Magasin magasin){
        return is.ajouterMagasinEtPersonnels(magasin);
    }



}
