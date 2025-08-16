package com.simple.partner.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ReserveDto extends BaseDto{
    Long reserverId;

    public ReserveDto(Boolean success) {
        this.success = success;
    }
}
