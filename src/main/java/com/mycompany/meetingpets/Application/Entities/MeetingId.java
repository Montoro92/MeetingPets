/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author montoro
 */
@Embeddable
public class MeetingId implements Serializable {
    
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="pet")
    private Long pet;
    
    public MeetingId(){}
    
    public MeetingId(Long pet) {
        this.pet=pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPet() {
        return pet;
    }

    public void setPet(Long pet) {
        this.pet = pet;
    }
    
}
