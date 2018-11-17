package com.joes.gestion.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joes.gestion.dao.CongeRepository;
import com.joes.gestion.entity.Conge;
import com.joes.gestion.entity.Contrat;
import com.joes.gestion.entity.Employe;


@Service
@Transactional

public class CongeService {

	private final CongeRepository congeRepository;
	@Autowired
	private EmployeService employeSerivce;

	@Autowired
	public CongeService(CongeRepository congeRepository) {
		this.congeRepository=congeRepository;
	}
	
	public List<Conge> getConges(){
		return congeRepository.findAll();
	}
	
	public Conge find(int c) {
        return congeRepository.findById(c).isPresent() ? congeRepository.findById(c).get(): null;
    }


    public Conge update ( int code , Conge c) {

        return congeRepository.save(c);
    }


    public Conge save( Conge c) {
    	
    	congeRepository.save(c);
    	Employe e= employeSerivce.findEmployeById(c.getEmployee().cin);
    	e.addConge(c);
    	employeSerivce.updateEmploye(e, e.cin) ;  	
    	
    	
    	return c;


    }

    public void delete (int c) {
        congeRepository.deleteById(c);
    }
	
	
	
	
	
	
	
	
}
