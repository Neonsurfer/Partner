package com.simple.partner.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class SimpleEventDto {
    Long id;
    List<SeatDto> data;
    Boolean success;
}
