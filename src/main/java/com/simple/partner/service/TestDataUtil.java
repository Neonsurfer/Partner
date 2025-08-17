package com.simple.partner.service;

import com.simple.partner.dto.EventDto;
import com.simple.partner.dto.ExtendedEventDto;
import com.simple.partner.dto.SeatDto;
import com.simple.partner.dto.SimpleEventDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class TestDataUtil {

    public SimpleEventDto getMockFirstEvent() {
        return new SimpleEventDto(true)
                .setEventId(1L)
                .setSeats(List.of(
                        new SeatDto("S1", BigDecimal.valueOf(1000L), "HUF", true),
                        new SeatDto("S2", BigDecimal.valueOf(1000L), "HUF", false),
                        new SeatDto("S3", BigDecimal.valueOf(1000L), "HUF", false),
                        new SeatDto("S4", BigDecimal.valueOf(1000L), "HUF", false),
                        new SeatDto("S5", BigDecimal.valueOf(1000L), "HUF", false),
                        new SeatDto("S6", BigDecimal.valueOf(1000L), "HUF", true),
                        new SeatDto("S7", BigDecimal.valueOf(1000L), "HUF", true),
                        new SeatDto("S8", BigDecimal.valueOf(1000L), "HUF", true),
                        new SeatDto("S9", BigDecimal.valueOf(1000L), "HUF", true),
                        new SeatDto("S10", BigDecimal.valueOf(1000L), "HUF", true)
                ));
    }

    public SimpleEventDto getMockSecondEvent() {
        return new SimpleEventDto(true)
                .setEventId(2L)
                .setSeats(List.of(
                        new SeatDto("S1", BigDecimal.valueOf(2000L), "HUF", false),
                        new SeatDto("S2", BigDecimal.valueOf(2000L), "HUF", true),
                        new SeatDto("S3", BigDecimal.valueOf(2000L), "HUF", false),
                        new SeatDto("S4", BigDecimal.valueOf(2000L), "HUF", false),
                        new SeatDto("S5", BigDecimal.valueOf(2000L), "HUF", false),
                        new SeatDto("S6", BigDecimal.valueOf(2000L), "HUF", true),
                        new SeatDto("S7", BigDecimal.valueOf(2000L), "HUF", true),
                        new SeatDto("S8", BigDecimal.valueOf(2000L), "HUF", true),
                        new SeatDto("S9", BigDecimal.valueOf(2000L), "HUF", true),
                        new SeatDto("S10", BigDecimal.valueOf(2000L), "HUF", true)
                ));
    }

    public SimpleEventDto getMockThirdEvent() {
        return new SimpleEventDto(true)
                .setEventId(3L)
                .setSeats(List.of(
                        new SeatDto("S1", BigDecimal.valueOf(3000L), "HUF", false),
                        new SeatDto("S2", BigDecimal.valueOf(3000L), "HUF", false),
                        new SeatDto("S3", BigDecimal.valueOf(3000L), "HUF", true),
                        new SeatDto("S4", BigDecimal.valueOf(3000L), "HUF", false),
                        new SeatDto("S5", BigDecimal.valueOf(3000L), "HUF", false),
                        new SeatDto("S6", BigDecimal.valueOf(3000L), "HUF", true),
                        new SeatDto("S7", BigDecimal.valueOf(3000L), "HUF", true),
                        new SeatDto("S8", BigDecimal.valueOf(3000L), "HUF", true),
                        new SeatDto("S9", BigDecimal.valueOf(3000L), "HUF", true),
                        new SeatDto("S10", BigDecimal.valueOf(3000L), "HUF", true)
                ));
    }

    public ExtendedEventDto getMockEvents() {
        return new ExtendedEventDto(true)
                .setData(List.of(
                        new EventDto()
                                .setEventId(1L)
                                .setTitle("Szilveszteri zártkörű rendezvény")
                                .setLocation("Greenwich")
                                .setStartTimeStamp("1577836800")
                                .setEndTimeStamp("1577844000"),
                        new EventDto()
                                .setEventId(2L)
                                .setTitle("Májusi mulatság")
                                .setLocation("Budapest")
                                .setStartTimeStamp("1588334400")
                                .setEndTimeStamp("1588348800"),
                        new EventDto()
                                .setEventId(3L)
                                .setTitle("Necc party")
                                .setLocation("Debrecen")
                                .setStartTimeStamp("1607731200")
                                .setEndTimeStamp("1607817599")
                ));
    }
}
