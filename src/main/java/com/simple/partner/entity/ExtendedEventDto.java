package com.simple.partner.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ExtendedEventDto {
    Boolean success;
    List<EventDto> data;
}
