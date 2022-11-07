package tn.esprit.service.interfaces;

import tn.esprit.duo.entities.Contrat;

import java.util.List;


public interface ContratService {
	
    public Contrat afficherContrat(int id);
    public int ajouterContrat(Contrat c);
    public Contrat mettreAjourContrat(int id);
    public void supprimerContrat(int id);
    public List<Contrat> chercherContrats ();
}

