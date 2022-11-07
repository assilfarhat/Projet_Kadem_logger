package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.duo.entities.Etudiant;
import tn.esprit.service.interfaces.EtudiantService;



@RestController
@RequestMapping("/ControllerEtudiant")
public class EtudiantController {
	@Autowired
	EtudiantService etudServ;
	
	@GetMapping("/DisplayStudent")
	public List<Etudiant> DisplayAllStudent() {
		return etudServ.ChecherEtudiant();
	}
	
	// http://localhost:8081/SpringMVC/ControllerEtudiant/AddStudent
	@PostMapping("/AddStudent")
	@ResponseBody
	public Etudiant addEtudiant(Etudiant e)
	{
	 etudServ.AjouterEtudiant(e);
	return e;
	}
	
	@GetMapping("/RetrieveEtudiant/{id}")
	@ResponseBody
	public Etudiant retrieveOperateur(@PathVariable("id") int id) {
	return etudServ.AfficherEtudiant(id);
	}
	
	@DeleteMapping("/RemoveEtudiant/{id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("id") int id) {
		etudServ.SupprimerEtudiant(id);
	}

	// http://localhost:8089/SpringMVC/operateur/modify-operateur
	@PutMapping("/ModifyEtudiant/id")
	@ResponseBody
	public Etudiant modifyOperateur(@PathVariable("id") int id) {
	return etudServ.MettreAjourEtudiant(id);
	}

	

}
