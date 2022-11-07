package tn.esprit.service.classes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import tn.esprit.duo.entities.Equipe;
import tn.esprit.duo.interfaces.EquipeRepository;
import tn.esprit.service.interfaces.EquipeService;

@Service
@Slf4j
public class EquipeServiceImpl implements EquipeService {

	 @Autowired
	    EquipeRepository equipeRep;

	    @Override
	    public Equipe afficherEquipe(int id) {
	    	Equipe equipe =(Equipe) equipeRep.findById(id).get();
	 		log.info("Equipe :"+ equipe);
	 	
        return equipe;

	    }

	    @Override
	    public int ajouterEquipe(Equipe e) {
	        equipeRep.save(e);
	        log.info(e +"Ajouter avec succee ");
	        return e.getIdEquipe();
	    }

	    @Override
	    public Equipe mettreAjourEquipe(int id) {
	        Equipe e = equipeRep.findById(id).get();
	        equipeRep.save(e);
	        log.info("Mise à jour réussie:"+e);
	        return (e);
	    }

	    @Override
	    public void supprimerEquipe(int id) {
	        equipeRep.deleteById(id);
	        log.info("supprimé" );
	    }

	    @Override
	    public List<Equipe> chercherEquipes() {
	    	List<Equipe> equipes =(List<Equipe>) equipeRep.findAll();
	    	for(Equipe equipe : equipes){
	    		log.info("Equipe : "+ equipe);
	 
	    	}
	        return equipes;
	    }

}
