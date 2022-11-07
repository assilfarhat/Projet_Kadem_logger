package tn.esprit.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.duo.entities.DetailEquipe;
import tn.esprit.service.interfaces.DetailEquipeService;

import java.util.List;

@RestController
@RequestMapping("/detailEquipe")
public class DetailEquipeController {

    @Autowired
    DetailEquipeService detServ;

    @GetMapping
    public List<DetailEquipe> displayAllDetails() {
        return detServ.chercherDetailEquipes();
    }

    @GetMapping("display/{id}")
    public DetailEquipe displayDetailsById(@PathVariable("id") int id) {
        return detServ.afficherDetailEquipe(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteDetailsById(@PathVariable("id") int id) {
        detServ.supprimerDetailEquipe(id);
    }

    @PostMapping("/add")
    public int saveDetails(
             @RequestBody DetailEquipe detailEquipe)
    {
        return detServ.ajouterDetailEquipe(detailEquipe);
    }

    @PutMapping("update/{id}")
    public DetailEquipe update( @PathVariable("id") int id) {
       
            return detServ.mettreAjourDetailEquipe(id);
        
    }

}