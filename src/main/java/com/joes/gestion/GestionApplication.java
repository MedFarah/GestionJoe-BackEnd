package com.joes.gestion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joes.gestion.entity.Dossier;
import com.joes.gestion.entity.Employe;
import com.joes.gestion.service.DossierService;
import com.joes.gestion.service.EmployeService;

@SpringBootApplication
public class GestionApplication implements CommandLineRunner{
	@Autowired
	private EmployeService  employeService;
	@Autowired
	private DossierService  dossierService;
    public static void main(String[] args) {
        SpringApplication.run(GestionApplication.class, args);
        

    	
    
		
    }
	@Override
	public void run(String... args) throws Exception {
	/*	Date date =new Date();
		
		Dossier d= new Dossier(4,true ,true,true,true,true);
		Employe e =new Employe(4, "sahar", "sahar", "sahar", "sahar", "sahar", date, 1111,5555 );
		dossierService.save(d);
		Dossier d2 =dossierService.find(d.getCoded());
         e.setDossier(d2);
		employeService.addEmploye(e);
		 d2.setEmploye(e);
		 dossierService.update(4, d2);*/
		 
		
		
		
	}
}
