package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.duo.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer>{

}
