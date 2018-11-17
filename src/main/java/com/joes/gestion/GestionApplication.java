package com.joes.gestion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joes.gestion.entity.Dossier;
import com.joes.gestion.entity.Employe;
import com.joes.gestion.entity.TypePost;
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
		/*Date date =new Date();
		
		Dossier d= new Dossier(5,true ,true,true,true,true);
		TypePost p= new TypePost("bla");
		Employe e =new Employe(5, "sahar", "sahar", "sahar", "sahar", "sahar", date, 1111,5555,p );
		d.setEmploye(e);
		
		employeService.addEmploye(e);
		dossierService.save(d);
		*/
         
         
         

		
		 
		 
		
		 
		
		
		
	}
}
