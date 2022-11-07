package tn.esprit.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.duo.entities.Contrat;

import tn.esprit.service.interfaces.ContratService;

@RestController
@RequestMapping("/contrat")
public class ContratController {
	@Autowired
	ContratService cServ;
	

    @GetMapping
    public List<Contrat> displayAllContrat() {
        return cServ.chercherContrats();
    }

    @GetMapping("display/{id}")
    public Contrat displayContratById(@PathVariable("id") int id) {
        return cServ.afficherContrat(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteContratById(@PathVariable("id") int id) {
        cServ.supprimerContrat(id);
    }

    @PostMapping("/add")
    public int saveContrat( Contrat contrat)
    {
        return cServ.ajouterContrat(contrat);
    }

    @PutMapping("update/{id}")
    public Contrat update(@PathVariable("id") int id) {
		return cServ.mettreAjourContrat(id);
       
    	
    }

	 

}
