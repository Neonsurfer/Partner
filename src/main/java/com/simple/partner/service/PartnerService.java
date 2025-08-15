package com.simple.partner.service;

import com.simple.partner.entity.EventDto;
import com.simple.partner.entity.ExtendedEventDto;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class PartnerService {

    public ExtendedEventDto getEvents() {
        return new ExtendedEventDto()
                .setSuccess(true)
                .setData(List.of(
                        new EventDto()
                                .setEventId(1L)
                                .setTitle("Szilveszteri zártkörű rendezvény")
                                .setLocation("Greenwich")
                                .setStartTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1577836800L), ZoneId.of("ECT")))
                                .setEndTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1577844000), ZoneId.of("ECT"))),
                        new EventDto()
                                .setEventId(2L)
                                .setTitle("Májusi mulatság")
                                .setLocation("Budapest")
                                .setStartTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1588334400), ZoneId.of("ECT")))
                                .setEndTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1588348800), ZoneId.of("ECT"))),
                        new EventDto()
                                .setEventId(3L)
                                .setTitle("Necc party")
                                .setLocation("Debrecen")
                                .setStartTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1607731200), ZoneId.of("ECT")))
                                .setEndTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(1607817599), ZoneId.of("ECT")))
                ));
    }

}
