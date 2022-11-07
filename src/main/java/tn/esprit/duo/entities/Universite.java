package tn.esprit.duo.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Universite")
public class Universite  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private Integer idUniv; // Clé primaire
	private String nomUniv;
	
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;

	
	public Universite(Integer idUniv, String nomUniv) {
		super();
		this.idUniv = idUniv;
		this.nomUniv = nomUniv;
	}
	public Integer getIdUniv() {
		return idUniv;
	}
	public void setIdUniv(Integer idUniv) {
		this.idUniv = idUniv;
	}
	
	public String getNomUniv() {
		return nomUniv;
	}
	public void setNomUniv(String nomUniv) {
		this.nomUniv = nomUniv;
	}
	
	
	
}
