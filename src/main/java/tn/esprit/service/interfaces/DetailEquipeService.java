package tn.esprit.service.interfaces;
import tn.esprit.duo.entities.DetailEquipe;

import java.util.List;


public interface DetailEquipeService {


    public DetailEquipe afficherDetailEquipe(int id);
    public int ajouterDetailEquipe(DetailEquipe d);
    public DetailEquipe mettreAjourDetailEquipe(int id);
    public void supprimerDetailEquipe(int id);
    public List<DetailEquipe> chercherDetailEquipes ();
}
