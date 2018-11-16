package com.joes.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joes.gestion.entity.Conge;
import com.joes.gestion.service.CongeService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CongeController {
	
	private final CongeService congeService;

    @Autowired
    public CongeController(CongeService congeService) {
        this.congeService = congeService;
    }
    
    @RequestMapping(value="/Conges",method= RequestMethod.GET)
    public List<Conge> getConges(){

        return congeService.getConges();
    }

    @RequestMapping(value="/Conges/{c}",method=RequestMethod.GET)
    public Conge find(@PathVariable int c) {
        return congeService.find(c);
    }

    @RequestMapping(value="/Conges/{code}",method=RequestMethod.PUT)
    public Conge update (@PathVariable int code , @RequestBody Conge c) {

        return congeService.update(code, c);
    }

    @RequestMapping(value="/Conges",method=RequestMethod.POST)
    public Conge save(@RequestBody Conge c) {
        return congeService.save(c);
    }

    @RequestMapping(value="/Conges/{c}",method=RequestMethod.DELETE)
    public void delete (@PathVariable int c) {
    	congeService.delete(c);
    }

}
