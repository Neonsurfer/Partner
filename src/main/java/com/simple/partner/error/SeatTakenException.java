package com.simple.partner.error;

public class SeatTakenException extends BusinessException {
    public SeatTakenException() {
        super("Már lefoglalt székre nem lehet jegyet eladni!", 90010);
    }
}