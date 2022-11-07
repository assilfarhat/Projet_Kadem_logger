package tn.esprit.duo.entities;

import java.io.Serializable;
import java.util.Date;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

@OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
private Set<Contrat> Contrat ;
@ManyToOne
Departement departement;
@ManyToMany(mappedBy="etudiant", cascade = CascadeType.ALL)
private Set<Equipe> equipe;








}