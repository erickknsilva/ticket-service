package com.erickWck.ticket_service.domain.repository;

import com.erickWck.ticket_service.domain.entity.Airline;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AirlineRepository extends CrudRepository<Airline, Long> {

    Optional<Airline> findByIcaoCode(String iacao);

    @Override
    List<Airline> findAll();

    void deleteByIcaoCode(String icao);


}
