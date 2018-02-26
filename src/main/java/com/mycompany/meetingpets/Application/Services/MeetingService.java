/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Services;

import com.mycompany.meetingpets.Application.Entities.MeetingEntity;
import com.mycompany.meetingpets.Application.Repositories.MeetingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author montoro
 */
@Service
public class MeetingService {
    
    @Autowired
    private MeetingRepository meetingRepository;

    public List<MeetingEntity> getAllMeetings() {
        return meetingRepository.findAll();
    }
    
}
