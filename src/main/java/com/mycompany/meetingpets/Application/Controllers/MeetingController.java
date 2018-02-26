/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meetingpets.Application.Controllers;

import com.mycompany.meetingpets.Application.Entities.MeetingEntity;
import com.mycompany.meetingpets.Application.Services.MeetingService;
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
@RequestMapping(value="/meeting")
public class MeetingController {
    
    @Autowired
    private MeetingService meetingService;
    
    @RequestMapping(method=RequestMethod.GET, value="/allMeetings")
    public List<MeetingEntity> getAllMeetings() {
        return meetingService.getAllMeetings();
    }
}
