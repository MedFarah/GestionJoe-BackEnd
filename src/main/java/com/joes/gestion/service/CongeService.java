package com.joes.gestion.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joes.gestion.dao.CongeRepository;
import com.joes.gestion.entity.Conge;


@Service
@Transactional
public class CongeService {

	private final CongeRepository congeRepository;

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

        return congeRepository.save(c);
    }

    public void delete (int c) {
        congeRepository.deleteById(c);
    }
	
	
	
	
	
	
	
	
}
