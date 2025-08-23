package com.simple.partner.error;

public class SeatNotFoundException extends BusinessException {
    public SeatNotFoundException() {
        super("Nem létezik ilyen szék!", 90002);
    }
}
