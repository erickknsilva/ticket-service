package com.erickWck.ticket_service.domain.exception;

public class AircraftAlreadyException extends RuntimeException {

    public AircraftAlreadyException(String message) {
        super("Aircraft with mode: " + message + " already exist.");
    }
}
