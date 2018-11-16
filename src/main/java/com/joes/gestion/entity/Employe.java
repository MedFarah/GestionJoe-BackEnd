package com.joes.gestion.entity;



import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;
import java.util.List;

@Entity

public class Employe extends Utilisateur  {

    private double salaire;
    
    private Boolean isAdmin;
    
    @OneToOne
    
    private Dossier dossier;

    @ManyToOne
    @JoinColumn(name="type_poste_id")
    @JsonIgnore
    private TypePost typePost;

    @OneToMany(mappedBy="employe",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Contrat> contrat;

    @OneToMany( mappedBy = "employe",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Conge> conges;

    
    public Employe(int cin, String nom, String prenom, String adresse, String login, String mdp, Date dateNaiss, int tel,double salaire) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.login = login;
        this.mdp = mdp;
        this.dateNaiss = dateNaiss;
        this.tel = tel;
        this.salaire=salaire;
    }

    public Employe() {

    }

    public TypePost getTypePost() {
        return typePost;
    }

    public void setTypePost(TypePost typePost) {
        this.typePost = typePost;
    }

    public List<Contrat> getContrat() {
        return contrat;
    }

    public void setContrat(List<Contrat> contrat) {
        this.contrat = contrat;
    }

    @JsonIgnore
    public Dossier getDossier() {
        return dossier;
    }
    
    @JsonSetter
    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
