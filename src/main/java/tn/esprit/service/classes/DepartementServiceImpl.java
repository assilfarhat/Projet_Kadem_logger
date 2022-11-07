package tn.esprit.service.classes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.duo.entities.Departement;
import tn.esprit.duo.interfaces.DepartementRepository;
import tn.esprit.service.interfaces.DepartementService;

@Service
@Slf4j
public class DepartementServiceImpl implements DepartementService  {

	@Autowired
    DepartementRepository depRep;

    @Override
    public Departement afficherDepartement(int id) {
    	Departement departement =(Departement) depRep.findById(id).get();
 		log.info("Departement :"+ departement);
    
        return departement;
    }

    @Override
    public int ajouterDepartement(Departement e) {
        depRep.save(e);
        log.info(e + " Ajouter avec succee ");
        return e.getIdDepart();
    }

    @Override
    public Departement mettreAjourDepartement(int id) {
        Departement e = depRep.findById(id).get();
        depRep.save(e);
        log.info("Mise à jour réussie:"+e );
        return (e);
    }

    @Override
    public void supprimerDepartement(int id) {
        depRep.deleteById(id);
        log.info("supprimé" );
    }

    @Override
    public List<Departement> chercherDepartements() {
    	List<Departement> deps =(List<Departement>) depRep.findAll();
    	for(Departement dep : deps){
    		log.info("Departement : "+ dep);
 
    	}
    	return deps;
    }

}
