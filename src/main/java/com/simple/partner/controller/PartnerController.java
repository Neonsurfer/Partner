package com.simple.partner.controller;


import com.simple.partner.service.PartnerService;
import com.simple.simpleLib.dto.ExtendedEventDto;
import com.simple.simpleLib.dto.ReserveDto;
import com.simple.simpleLib.dto.SimpleEventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("partner")
public class PartnerController {

    @Autowired
    private PartnerService service;

    @GetMapping("/getEvents")
    @ResponseStatus(HttpStatus.OK)
    public ExtendedEventDto getEvents() {
        return service.getEvents();
    }

    @GetMapping("/getEvent/{eventId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleEventDto getEventById(@PathVariable Long eventId) {
        return service.getEventById(eventId);
    }

    @PostMapping("/reserve/{eventId}/{seatId}")
    @ResponseStatus(HttpStatus.OK)
    public ReserveDto reserve(@PathVariable Long eventId, @PathVariable Long seatId) {
        return service.reserveByEventAndSeat(eventId, seatId);
    }

}
