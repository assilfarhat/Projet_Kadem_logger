package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.duo.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer>{

}
