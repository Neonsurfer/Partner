package com.simple.partner.controller;

import com.simple.partner.entity.ExtendedEventDto;
import com.simple.partner.entity.SimpleEventDto;
import com.simple.partner.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("partner")
public class PartnerController {

    @Autowired
    private PartnerService service;

    @GetMapping("/getEvents")
    @ResponseStatus(HttpStatus.OK)
    public ExtendedEventDto getEvents() {
        return service.getEvents();
    }

    ;

    @GetMapping("/getEvent/{eventId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleEventDto getEventById(@PathVariable Long eventId) {
        return service.getEventById(eventId);
    }

    ;

}
