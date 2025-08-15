package com.simple.partner.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class SeatDto {
    Long id;
    BigDecimal price;
    String currency;
    Boolean reserved;
}
