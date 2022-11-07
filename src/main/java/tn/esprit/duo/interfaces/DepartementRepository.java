package tn.esprit.duo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.duo.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository <Departement,Integer> {

}
