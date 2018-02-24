/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Services;

import com.mycompany.meetingpets.Application.Entities.PetEntity;
import com.mycompany.meetingpets.Application.Repositories.PetRepository;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author montoro
 */
@Service
public class PetService {
    
    @Autowired
    private PetRepository petRepository;
    
    public List<PetEntity> getAllPets() {
        return petRepository.findAll();
    }
    
    public PetEntity getById(Long id) {
        return petRepository.findById(id);
    }
    
    public String addPet(Map<String, Object> parameters) {
        PetEntity pet = new PetEntity();
        try {
            BeanUtils.populate(pet, parameters);
            petRepository.saveAndFlush(pet);
            return "OK";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    public String updatePet(Map<String, Object> parameters) {
        PetEntity pet = petRepository.findById(Long.parseLong(parameters.get("id").toString()));
        try {
            BeanUtils.populate(pet, parameters);
            petRepository.saveAndFlush(pet);
            return "OK";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    public String deletePet(Long id) {
        petRepository.delete(id);
        return "OK";
    }
    
}
