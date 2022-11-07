package tn.esprit.service.classes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;
import tn.esprit.duo.entities.Contrat;

import tn.esprit.duo.interfaces.ContratRepository;
import tn.esprit.service.interfaces.ContratService;


@Service
@Slf4j
public class ContratServiceImpl implements ContratService {

	 @Autowired
	    ContratRepository cRep;

	
	 @Override
	    public Contrat afficherContrat(int id) {
		 	Contrat contrat =(Contrat) cRep.findById(id).get();
		 		log.info("contrat :"+ contrat);
		 	
	        return contrat;
	    }

	    @Override
	    public int ajouterContrat(Contrat c) {
	        cRep.save(c);
	        log.info(c+"Ajouter avec succee ");
	        return c.getIdContrat();
	    }

	    @Override
	    public Contrat mettreAjourContrat(int id) {
	        Contrat c = cRep.findById(id).get();
	        cRep.save(c);
	        log.info("Mise à jour réussie:"+c );
	        return (c);
	    }

	    @Override
	    public void supprimerContrat(int id) {
	    	cRep.deleteById(id);
	    	log.info("supprimé" );
	    }

	    @Override
	    public List<Contrat> chercherContrats() {
	    	List<Contrat> contrats =(List<Contrat>) cRep.findAll();
	    	for(Contrat contrat : contrats){
	    		log.info("contrat : "+ contrat);
	 
	    	}
	        return contrats;
	    }
}

