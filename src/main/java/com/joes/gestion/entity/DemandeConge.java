package com.joes.gestion.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class DemandeConge implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3315249961882360780L;

	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroD;

    
    @Temporal(TemporalType.DATE)
    private Date dateD;

    
    private boolean etatD;

    @OneToOne()
    private Conge conge;
    
    

    public DemandeConge() {
	}

	public int getNumeroD() {
        return this.numeroD;
    }

    public void setNumeroD(int numeroD) {
        this.numeroD = numeroD;
    }

    public Date getDateD() {
        return this.dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public boolean isEtatD() {
        return this.etatD;
    }

    public void setEtatD(boolean etatD) {
        this.etatD = etatD;
    }

    public Conge getConge() {
        return this.conge;
    }

    public void setConge(Conge conge) {
        this.conge = conge;
    }

}