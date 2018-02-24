/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Controllers;

import com.mycompany.meetingpets.Application.Entities.PetEntity;
import com.mycompany.meetingpets.Application.Repositories.PetRepository;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
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
    private PetRepository petRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/allPets")
    public List<PetEntity> getAllPets() {
        return petRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/findById")
    public PetEntity getById(@RequestParam String id) {
        return petRepository.findById(Long.parseLong(id));
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/addPet")
    public String addPet(@RequestBody Map<String, Object> parameters) {
        PetEntity pet = new PetEntity();
        try {
            BeanUtils.populate(pet, parameters);
            petRepository.saveAndFlush(pet);
            return "OK";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/updatePet")
    public String updatePet(@RequestBody Map<String, Object> parameters) {
        PetEntity pet = petRepository.findById(Long.parseLong(parameters.get("id").toString()));
        try {
            BeanUtils.populate(pet, parameters);
            petRepository.saveAndFlush(pet);
            return "OK";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/deletePet")
    public String deletePet(@RequestParam String id) {
        petRepository.delete(Long.parseLong(id));
        return "OK";
    }
}
