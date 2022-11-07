package tn.esprit.service.interfaces;

import java.util.List;


import tn.esprit.duo.entities.Departement;

public interface DepartementService {
	public Departement afficherDepartement(int id);
    public int ajouterDepartement(Departement d);
    public Departement mettreAjourDepartement(int id);
    public void supprimerDepartement(int id);
    public List<Departement> chercherDepartements ();

}
