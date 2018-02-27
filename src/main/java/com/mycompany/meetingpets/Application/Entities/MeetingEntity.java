/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author montoro
 */
@Entity
@Table(name="meeting")
public class MeetingEntity implements Serializable {
    
    @EmbeddedId
    private MeetingId meetingId;
    
    @Column(name="meetingdate")
    @Temporal(TemporalType.DATE)
    private Date meetingDate;
    
    public MeetingEntity(){}
    
    public MeetingEntity(MeetingId meetingId, Date meetingDate) {
        this.meetingId=meetingId;
        this.meetingDate=meetingDate;
    }

    public MeetingId getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(MeetingId meetingId) {
        this.meetingId = meetingId;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingPate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }
    
    
    
}
