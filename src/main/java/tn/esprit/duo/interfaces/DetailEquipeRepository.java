package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.duo.entities.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {

}
