package com.backend.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public @Data abstract class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@JsonIgnore
	String nom;
	@JsonIgnore
	String prenom;
	@JsonIgnore
	String cin;
	@JsonIgnore
	String adresse;
	@JsonIgnore
	String telephone;
	@JsonIgnore
	String email;
	@Column(unique=true,nullable=false)
	String username;
	@Column(nullable=false)
	String password;
	@Column(nullable=false)
	String role;
}
