package com.joes.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.joes.gestion.dao.DemandeCongeRepository;
import com.joes.gestion.entity.DemandeConge;

@Service
@Transactional
public class DemandeCongeService {

	private final DemandeCongeRepository demandecongeRepository;

	@Autowired
	public DemandeCongeService(DemandeCongeRepository demandecongeRepository) {
		this.demandecongeRepository=demandecongeRepository;
	}
	
	public List<DemandeConge> getDemandeConges(){
		return demandecongeRepository.findAll();
	}
	
	public DemandeConge find(int c) {
        return demandecongeRepository.findById(c).isPresent() ? demandecongeRepository.findById(c).get(): null;
    }


    public DemandeConge update ( int code , DemandeConge c) {

        return demandecongeRepository.save(c);
    }


    public DemandeConge save( DemandeConge c) {

        return demandecongeRepository.save(c);
    }

    public void delete (int c) {
        demandecongeRepository.deleteById(c);
    }
	
}
