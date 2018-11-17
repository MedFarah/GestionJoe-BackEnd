package com.joes.gestion.service;

import com.joes.gestion.dao.EmployeRepository;
import com.joes.gestion.entity.Dossier;
import com.joes.gestion.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class EmployeService {

    private final EmployeRepository employeRepository;
    @Autowired
    private DossierService dossierService;

    @Autowired
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public List<Employe> getAll(){
        return employeRepository.findAll();
    }

    public Employe findEmployeById(int id){
        return employeRepository.findById(id).isPresent()? employeRepository.findById(id).get():null;
    }

    public Employe addEmploye(Employe employe){
    	Dossier d =dossierService.find(employe.getDossier().getCoded());
    	
    	 // e.setDossier(d);
    	employeRepository.save(employe);
  		 d.setEmploye(employe);
  		 dossierService.update(d.getCoded(),d);
    	
        return employe;
    }

    public Employe updateEmploye(Employe employe, int id ){
        if(id!=employe.getCin()){
            employeRepository.deleteById(id);
        }
        return employeRepository.save(employe);
    }
    public void deleteEmplye(int id){
        employeRepository.deleteById(id);
    }

    public Employe login(String email, String pass){
        return getAll().stream().filter(user-> user.getLogin().equals(email)&& user.getMdp().equals(pass)).findAny().orElse(null);
    }

}
