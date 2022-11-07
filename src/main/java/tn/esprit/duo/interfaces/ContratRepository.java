package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.duo.entities.Contrat;


@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer>{

}
