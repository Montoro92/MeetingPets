/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Repositories;

import com.mycompany.meetingpets.Application.Entities.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author montoro
 */
public interface PetRepository extends JpaRepository<PetEntity, Long> {
    public PetEntity findById(Long id);
}
