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

}
