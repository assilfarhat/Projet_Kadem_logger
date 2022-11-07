package tn.esprit.service.classes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.duo.entities.Universite;
import tn.esprit.duo.interfaces.UniversiteRepository;
import tn.esprit.service.interfaces.UniversiteService;

@Service
@Slf4j

public class UniversiteServiceImpl implements UniversiteService {
    @Autowired
    UniversiteRepository uniRep;
    @Override
    public Universite afficherUniversite(int id) {
    	Universite universite =(Universite) uniRep.findById(id).get();
 		log.info("Universite :"+ universite);
 	
    return universite;
    }

    @Override
    public int ajouterUniversite(Universite u) {
        uniRep.save(u);
        log.info(u+"Ajouter avec succee ");
        return u.getIdUniv();
    }

    @Override
    public Universite mettreAjourUniversite(int id) {
        Universite u = uniRep.findById(id).get();
        uniRep.save(u);
        log.info("Mise à jour réussie:"+u );
        return (u);
    }

    @Override
    public void supprimerUniversite(int id) {
        uniRep.deleteById(id);
    	log.info("supprimé" );
    }

    @Override
    public List<Universite> chercherUniversites() {
    	List<Universite> universites =(List<Universite>) uniRep.findAll();
    	for(Universite universite : universites){
    		log.info("Universite : "+ universite);
 
    	}
        return universites;
    }

    
}