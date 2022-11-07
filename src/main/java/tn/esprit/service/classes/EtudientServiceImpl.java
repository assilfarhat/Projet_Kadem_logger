package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import tn.esprit.duo.entities.Etudiant;
import tn.esprit.duo.interfaces.EtudiantRepository;
import tn.esprit.service.interfaces.EtudiantService;

@Service
@Slf4j
public class EtudientServiceImpl implements EtudiantService {

	@Autowired 
	EtudiantRepository etuRep;
	
	@Override
	public Etudiant AfficherEtudiant(int id) {
		Etudiant etudiant =(Etudiant) etuRep.findById(id).get();
 		log.info("Etudiant :"+ etudiant);
 	
    return etudiant;
	}

	@Override
	public int AjouterEtudiant(Etudiant E) {
		etuRep.save(E);
		 log.info(E+"Ajouter avec succee ");
		return E.getIdEtudiant();
	}

	@Override
	public Etudiant MettreAjourEtudiant(int id) {
		Etudiant e = etuRep.findById(id).get();
		etuRep.save(e);
		log.info("Mise à jour réussie:"+e );
		return (e);	
	}

	@Override
	public void SupprimerEtudiant(int id) {
		etuRep.deleteById(id);
		log.info("supprimé" );
	}

	@Override
	public List<Etudiant> ChecherEtudiant() {
		
		List<Etudiant> etudiants =(List<Etudiant>) etuRep.findAll();
    	for(Etudiant etudiant : etudiants){
    		log.info("Etudiant : "+ etudiant);
 
    	}
        return etudiants;
	}

}
