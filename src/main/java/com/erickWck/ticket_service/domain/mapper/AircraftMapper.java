package com.erickWck.ticket_service.domain.mapper;

import com.erickWck.ticket_service.controller.dto.aircraft.AircraftDtoRequest;
import com.erickWck.ticket_service.controller.dto.aircraft.AircraftDtoResponse;
import com.erickWck.ticket_service.domain.entity.Aircraft;

public abstract class AircraftMapper {

    public static Aircraft createAircraft(AircraftDtoRequest request) {
        return new Aircraft(null, request.model(), request.manufacturer(), request.seatCapacity());
    }

    public static AircraftDtoResponse entityToDto(Aircraft aircraft) {
        return new AircraftDtoResponse(aircraft.model(), aircraft.manufacturer(), aircraft.seatCapacity());
    }

}
