package com.simple.partner.error;

public class EventNotFoundException extends BusinessException {
    public EventNotFoundException() {
        super("Nem létezik ilyen esemény!", 90001);
    }
}
