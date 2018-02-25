/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Controllers;

import com.mycompany.meetingpets.Application.Entities.OwnerEntity;
import com.mycompany.meetingpets.Application.Services.OwnerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author montoro
 */
@RestController
@RequestMapping(value="/owner")
public class OwnerController {
    
    @Autowired
    private OwnerService ownerService;
    
    @RequestMapping(method=RequestMethod.GET, value="/allOwners")
    public List<OwnerEntity> getAllOwners() {
        return ownerService.getAllOwner();
    }
    
}
