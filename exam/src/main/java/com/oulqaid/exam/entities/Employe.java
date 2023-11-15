package com.oulqaid.exam.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String photo;
	
	@ManyToOne
	private Servicee service;
	
	public Servicee getService() {
		return service;
	}


	public void setService(Servicee service) {
		this.service = service;
	}


	@ManyToOne
    private Employe employe;
	
    @OneToMany(mappedBy = "employe",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Employe> employes = new ArrayList();
	
	
	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public List<Employe> getEmployes() {
		return employes;
	}


	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}


	public Employe() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	

}
