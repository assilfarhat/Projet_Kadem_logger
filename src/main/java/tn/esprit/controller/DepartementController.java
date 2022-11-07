package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.duo.entities.Departement;
import tn.esprit.service.interfaces.DepartementService;


import java.util.List;


@RestController
@RequestMapping("/departement")
public class DepartementController {

    @Autowired
    DepartementService depServ;

    @GetMapping
    public List<Departement> displayAllDepartment() {
        return depServ.chercherDepartements();
    }

    @GetMapping("display/{id}")
    public Departement displayDepartmentById(@PathVariable("id") int id) {
        return depServ.afficherDepartement(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteDepartmentById(@PathVariable("id") int id) {
        depServ.supprimerDepartement(id);
    }

    @PostMapping("/add")
    public int saveDepartment(@RequestBody Departement departement)
    {
        return depServ.ajouterDepartement(departement);
    }

    @PutMapping("update/{id}")
    public Departement update(@PathVariable("id") int id) {
        
            return depServ.mettreAjourDepartement(id);
        
    }

}