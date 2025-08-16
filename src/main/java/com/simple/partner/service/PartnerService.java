package com.simple.partner.service;

import com.simple.partner.entity.ExtendedEventDto;
import com.simple.partner.entity.SimpleEventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        } else {
            return testDataUtil.getMockThirdEvent();
        }
    }


}
