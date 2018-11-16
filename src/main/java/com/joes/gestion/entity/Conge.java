package com.joes.gestion.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Conge implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4133521753809343423L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codeconges;

  
    @Temporal(TemporalType.DATE)
    private Date dateDeb;

    
    @Temporal(TemporalType.DATE)
    private Date dateFin;

  
    private float solde;

    @OneToOne()
    private DemandeConge demandeConge;

    @ManyToOne()
    @JsonIgnore
    private Employe employe;

    @ManyToOne()
    @JsonIgnore
    private TypeConge typeConge;

    
    
    public Conge() {
		
	}
    
    
    
	public int getCodeconges() {
        return this.codeconges;
    }

    public void setCodeconges(int codeconges) {
        this.codeconges = codeconges;
    }

    public Date getDateDeb() {
        return this.dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getSolde() {
        return this.solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public DemandeConge getDemandeConges() {
        return this.demandeConge;
    }

    public void setDemandeConges(DemandeConge demandeConges) {
        this.demandeConge = demandeConges;
    }

    public Employe getEmployee() {
        return this.employe;
    }

    public void setEmployee(Employe employee) {
        this.employe = employee;
    }

    public TypeConge getTypeConge() {
        return this.typeConge;
    }

    public void setTypeConge(TypeConge typeConge) {
        this.typeConge = typeConge;
    }

}
