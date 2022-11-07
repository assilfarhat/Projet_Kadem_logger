package tn.esprit.service.interfaces;


import java.util.List;

import tn.esprit.duo.entities.Etudiant;

public interface EtudiantService {
	
 public	Etudiant AfficherEtudiant(int id);
 public int AjouterEtudiant(Etudiant E);
 public Etudiant MettreAjourEtudiant(int id);
 public void SupprimerEtudiant(int id);
 public List<Etudiant> ChecherEtudiant();
 
  
	 
}
