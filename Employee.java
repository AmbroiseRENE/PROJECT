
// pinaise moi j'avais deja mis un commentaire ici

// cette classe c'est vraiment trop de la balle
package com.fr.adaming.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter	@Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Employee extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	
	private String prenom;
	@Email
	private String email;

	private String pwd;
	
	private double salaire;
	
	@Enumerated(EnumType.ORDINAL)
	private Fonction fonction;

	private LocalDate dateRecrutement;	

	@ManyToMany(mappedBy = "employees")
	private Set<Projet> projetsE;
	
	@ManyToOne
	@JoinColumn(name = "id_Societe")
	private Societe societeE;
	
	
}
