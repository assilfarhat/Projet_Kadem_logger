package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.duo.entities.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
	

}
