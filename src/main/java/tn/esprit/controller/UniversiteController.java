package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.duo.entities.Universite;
import tn.esprit.service.interfaces.UniversiteService;


import java.util.List;


@RestController
@RequestMapping("/universite")
public class UniversiteController {

    @Autowired
    UniversiteService univServ;

    @GetMapping
    public List<Universite> displayAllUni() {
        return univServ.chercherUniversites();
    }

    @GetMapping("display/{id}")
    public Universite displayUniById(@PathVariable("id") int id) {
        return univServ.afficherUniversite(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUniById(@PathVariable("id") int id) {
        univServ.supprimerUniversite(id);
    }

    @PostMapping("/add")
    public int saveUni(@RequestBody Universite universite)
    {
        return univServ.ajouterUniversite(universite);
    }

    @PutMapping("update/{id}")
    public Universite update(@PathVariable("id") int id) {
       
            return univServ.mettreAjourUniversite(id);
        
    }

}
