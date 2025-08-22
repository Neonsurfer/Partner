package com.simple.partner.service;

import com.simple.simpleLib.dto.ExtendedEventDto;
import com.simple.simpleLib.dto.ReserveDto;
import com.simple.simpleLib.dto.SeatDto;
import com.simple.simpleLib.dto.SimpleEventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Optional;

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
        return testDataUtil.getMockEvents();
    }

    /**
     * Returns mock data for test usage
     * Based on getEvent1.json, getEvent2.json, getEvent3.json
     *
     * @param eventId id of event to be returned
     * @return event corresponding with id
     */
    //TODO Miklós az if nem szép, keress rá szebb megoldást - Low priority
    public SimpleEventDto getEventById(Long eventId) {
        if (eventId == 1L) {
            return testDataUtil.getMockFirstEvent();
        } else if (eventId == 2L) {
            return testDataUtil.getMockSecondEvent();
        } else if (eventId == 3L) {
            return testDataUtil.getMockThirdEvent();
        } else {
            return null;
        }
    }


    public ReserveDto reserveByEventAndSeat(Long eventId, Long seatId) {
        SimpleEventDto dto = getEventById(eventId);
        if (dto == null) {
            return new ReserveDto(false, 90001);
        }
        Optional<SeatDto> optionalSeat = dto.getSeats().stream().filter(t -> t.getId().equals("S" + seatId)).findFirst();
        if (optionalSeat.isEmpty()) {
            return new ReserveDto(false, 90002);
        } else if (optionalSeat.get().getReserved())
            return new ReserveDto(false, 90003);
        else {
            return new ReserveDto(true, new SecureRandom().nextLong());
        }
    }
}
