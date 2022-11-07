package tn.esprit.duo.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Contrat")
public class Contrat implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer idContrat; // Clé primaire
@Temporal(TemporalType.DATE) 

private Date dateDebutContrat;
private Date dateFinContrat;

@Enumerated(EnumType.STRING)
private Specialite specialite;
private Boolean archive;
private Integer montantContrat;

@ManyToOne
Etudiant etudiant;







}
