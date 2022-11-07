package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.duo.entities.Equipe;
import tn.esprit.service.interfaces.EquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    EquipeService equipeServ;

    @GetMapping
    public List<Equipe> displayAllTeams() {
        return equipeServ.chercherEquipes();
    }

    @GetMapping("display/{id}")
    public Equipe displayTeamsById(@PathVariable("id") int id) {
        return equipeServ.afficherEquipe(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTeamsById(@PathVariable("id") int id) {
        equipeServ.supprimerEquipe(id);
    }

    @PostMapping("/add")
    public int saveTeams(@RequestBody Equipe equipe)
    {
        return equipeServ.ajouterEquipe(equipe);
    }

    @PutMapping("update/{id}")
    public Equipe update(@PathVariable("id") int id) {
        
            return equipeServ.mettreAjourEquipe(id);
        }
    
}
