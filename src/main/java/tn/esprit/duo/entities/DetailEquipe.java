package tn.esprit.duo.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

  //  @OneToOne(mappedBy="detailequipe")
	//private Equipe equipe;
	
	private Integer idDetailEquipe; // Clé primaire
	private Integer salle;
	private String thematique;
	@OneToOne(mappedBy="detailequipe")
    private Equipe equipe;
	


	
	
	
	

}
