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

    /**
     * Returns mock data for test usage
     * Based on getEvents.json
     *
     * @return
     */
    @GetMapping("/getEvents")
    @ResponseStatus(HttpStatus.OK)
    public ExtendedEventDto getEvents() {
        return service.getEvents();
    }

    /**
     * Returns mock data for test usage
     * Based on getEvent1.json, getEvent2.json, getEvent3.json
     *
     * @param eventId id of event to be returned
     * @return event corresponding with id
     */
    @GetMapping("/getEvent/{eventId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleEventDto getEventById(@PathVariable Long eventId) {
        return service.getEventById(eventId);
    }

    /**
     * Reserves a seat if possible, based on mock data
     *
     * @param eventId id of event for reservation
     * @param seatId  id of seat to be reserved
     * @return success and if so, reservationId
     */
    @PostMapping("/reserve/{eventId}/{seatId}")
    @ResponseStatus(HttpStatus.OK)
    public ReserveDto reserve(@PathVariable Long eventId, @PathVariable String seatId) {
        return service.reserveByEventAndSeat(eventId, seatId);
    }

}
