package tn.esprit.service.interfaces;
import tn.esprit.duo.entities.Equipe;

import java.util.List;



public interface EquipeService {
	public Equipe afficherEquipe(int id);
    public int ajouterEquipe(Equipe e);
    public Equipe mettreAjourEquipe(int id);
    public void supprimerEquipe(int id);
    public List<Equipe> chercherEquipes ();

}
