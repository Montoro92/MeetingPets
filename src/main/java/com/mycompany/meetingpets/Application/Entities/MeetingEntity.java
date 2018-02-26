/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author montoro
 */
@Entity
@Table(name="meeting")
public class MeetingEntity implements Serializable {
    
    @EmbeddedId
    private MeetingId meetingId;
    
    public MeetingEntity(){}

    public MeetingId getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(MeetingId meetingId) {
        this.meetingId = meetingId;
    }
    
}
