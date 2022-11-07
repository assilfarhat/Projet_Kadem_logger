package tn.esprit.service.classes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import tn.esprit.duo.entities.DetailEquipe;
import tn.esprit.duo.interfaces.DetailEquipeRepository;
import tn.esprit.service.interfaces.DetailEquipeService;

@Service
@Slf4j
public class DetailEquipeServiceImpl implements DetailEquipeService {

	 @Autowired
	    DetailEquipeRepository detailEquipeRep;

	    @Override
	    public DetailEquipe afficherDetailEquipe(int id) {
	    	DetailEquipe detailEquipe =(DetailEquipe) detailEquipeRep.findById(id).get();
	 		log.info("DetailEquipe :"+ detailEquipe);
        return detailEquipe;
	    }

	    @Override
	    public int ajouterDetailEquipe(DetailEquipe d) {
	        detailEquipeRep.save(d);
	        log.info(d+"Ajouter avec succee ");
	        return d.getIdDetailEquipe();
	    }

	    @Override
	    public DetailEquipe mettreAjourDetailEquipe(int id) {
	        DetailEquipe d = detailEquipeRep.findById(id).get();
	        detailEquipeRep.save(d);
	        log.info("Mise à jour réussie:"+d );
	        return (d);
	    }

	    @Override
	    public void supprimerDetailEquipe(int id) {
	        detailEquipeRep.deleteById(id);
	        log.info("supprimé" );
	    }

	    @Override
	    public List<DetailEquipe> chercherDetailEquipes() {
	    	List<DetailEquipe> detailEquipes =(List<DetailEquipe>) detailEquipeRep.findAll();
	    	for(DetailEquipe detailEquipe : detailEquipes){
	    		log.info("DetailEquipe : "+ detailEquipe);
	 
	    	}
	        return detailEquipes;
	    }

}
