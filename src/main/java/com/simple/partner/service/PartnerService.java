package com.simple.partner.service;

import com.simple.partner.error.EventNotFoundException;
import com.simple.partner.error.SeatNotFoundException;
import com.simple.partner.error.SeatTakenException;
import com.simple.simpleLib.dto.ExtendedEventDto;
import com.simple.simpleLib.dto.ReserveDto;
import com.simple.simpleLib.dto.SeatDto;
import com.simple.simpleLib.dto.SimpleEventDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Optional;

@Slf4j
@Service
public class PartnerService {

    @Autowired
    private TestDataUtil testDataUtil;

    /**
     * Returns mock data for test usage
     * Based on getEvents.json
     *
     * @return test data
     */
    public ExtendedEventDto getEvents() {
        log.info("Returning mock event list");
        return testDataUtil.getMockEvents();
    }

    /**
     * Returns mock data for test usage
     * Based on getEvent1.json, getEvent2.json, getEvent3.json
     *
     * @param eventId id of event to be returned
     * @return event corresponding with id
     */
    public SimpleEventDto getEventById(Long eventId) {
        log.info("Returning mock event by id {}", eventId);
        if (eventId == 1L) {
            return testDataUtil.getMockFirstEvent();
        } else if (eventId == 2L) {
            return testDataUtil.getMockSecondEvent();
        } else if (eventId == 3L) {
            return testDataUtil.getMockThirdEvent();
        } else {
            throw new EventNotFoundException();
        }
    }


    /**
     * Reserves a seat if possible, based on mock data
     *
     * @param eventId id of event for reservation
     * @param seatId  id of seat to be reserved
     * @return success and if so, reservationId
     */
    public ReserveDto reserveByEventAndSeat(Long eventId, String seatId) {
        log.info("Reserving seat for event: {}, with seatId: {}", eventId, seatId);
        SimpleEventDto dto = getEventById(eventId);
        if (dto == null) {
            throw new EventNotFoundException();
        }
        Optional<SeatDto> optionalSeat = dto.getSeats().stream().filter(t -> t.getId().equals(seatId)).findFirst();
        if (optionalSeat.isEmpty()) {
            throw new SeatNotFoundException();
        } else if (optionalSeat.get().getReserved())
            throw new SeatTakenException();
        else {
            log.info("Successful reservation, returning reservation id");
            return new ReserveDto(true, new SecureRandom().nextLong());
        }
    }
}
