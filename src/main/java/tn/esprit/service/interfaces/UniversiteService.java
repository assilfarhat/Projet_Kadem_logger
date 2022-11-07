package tn.esprit.service.interfaces;

import java.util.List;


import tn.esprit.duo.entities.Universite;

public interface UniversiteService {
	 public Universite afficherUniversite(int id);
	    public int ajouterUniversite(Universite u);
	    public Universite mettreAjourUniversite(int id);
	    public void supprimerUniversite(int id);
	    public List<Universite> chercherUniversites ();

}
