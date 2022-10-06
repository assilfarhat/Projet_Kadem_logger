package tn.esprit.duo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private Integer idEtudiant; // Clé primaire
private String prenomE;
private String nomE;
@Temporal(TemporalType.DATE) 

private Date dateDebut;
@Enumerated(EnumType.STRING)
private Option option;


public Etudiant() {
	super();  
}

public Etudiant(Integer idEtudiant, String prenomE, String nomE, Date dateDebut) {
	super();
	this.idEtudiant = idEtudiant;
	this.prenomE = prenomE;
	this.nomE = nomE;
	this.dateDebut = dateDebut;
}


public Date getDateDebut() {
	return dateDebut;
}

public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}


public Integer getIdEtudiant() {
	return idEtudiant;
}
public void setIdEtudiant(Integer idEtudiant) {
	this.idEtudiant = idEtudiant;
}
public String getPrenomE() {
	return prenomE;
}
public void setPrenomE(String prenomE) {
	this.prenomE = prenomE;
}
public String getNomE() {
	return nomE;
}
public void setNomE(String nomE) {
	this.nomE = nomE;
}


}