/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Controllers;

import com.mycompany.meetingpets.Application.Entities.PetEntity;
import com.mycompany.meetingpets.Application.Repositories.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author montoro
 */
@RestController
@RequestMapping("/pet")
public class PetController {
    
    @Autowired
    private PetRepository petRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/allPets")
    @ResponseBody
    public List<PetEntity> getAllPets() {
        return petRepository.findAll();
    }
}
