package tn.esprit.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Client;
import tn.esprit.spring.DAO.Entities.Magasin;
import tn.esprit.spring.DAO.Entities.Personnel;
import tn.esprit.spring.DAO.Repositories.CarteFidRepo;
import tn.esprit.spring.DAO.Repositories.ClientRepo;
import tn.esprit.spring.DAO.Repositories.MagasinRepo;
import tn.esprit.spring.DAO.Repositories.PersonnelRepo;

import java.util.List;

@Service
public class Services implements IServices {

    @Autowired
    private CarteFidRepo cfr;
    @Autowired
    private ClientRepo cr;
    @Autowired
    private MagasinRepo mr;
    @Autowired
    private PersonnelRepo pr;

    @Override
    public Client ajouterClient(Client c) {
        return cr.save(c);
    }

    @Override
    public Magasin ajouterMagasinEtPersonnels(Magasin magasin) {
        //magasin est child
        List<Personnel> caissiers=magasin.getCaissiers();
        Personnel directeur=magasin.getDirecteur();

        caissiers= (List<Personnel>) pr.saveAll(caissiers);
        directeur=pr.save(directeur);
        magasin=mr.save(magasin);

        // on affecte le child au parent
        directeur.setDirmag(magasin);
        for (Personnel p:caissiers
             ) {
            p.setPermag(magasin);
        }
        pr.save(directeur);
        pr.saveAll(caissiers);

        return magasin;
    }
}