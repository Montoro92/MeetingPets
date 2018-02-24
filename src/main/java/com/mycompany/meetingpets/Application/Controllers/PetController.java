/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Controllers;

import com.mycompany.meetingpets.Application.Entities.PetEntity;
import com.mycompany.meetingpets.Application.Services.PetService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author montoro
 */
@RestController
@RequestMapping(value="/pet")
public class PetController {
    
    @Autowired
    private PetService petService;
    
    @RequestMapping(method=RequestMethod.GET, value="/allPets")
    public List<PetEntity> getAllPets() {
        return petService.getAllPets();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/findById")
    public PetEntity getById(@RequestParam String id) {
        return petService.getById(Long.parseLong(id));
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/findByNif")
    public PetEntity getByNif(@RequestParam String nif) {
        return petService.getByNif(nif);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/addPet")
    public String addPet(@RequestBody Map<String, Object> parameters) {
        return petService.addPet(parameters);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/updatePet")
    public String updatePet(@RequestBody Map<String, Object> parameters) {
        return petService.updatePet(parameters);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/deletePet")
    public String deletePet(@RequestParam String id) {
        return petService.deletePet(Long.parseLong(id));
    }
}
