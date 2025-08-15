package com.simple.partner.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class EventDto {
    Long eventId;
    String title;
    String location;
    LocalDateTime startTimeStamp;
    LocalDateTime endTimeStamp;

}
