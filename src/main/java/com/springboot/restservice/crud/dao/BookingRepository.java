package com.springboot.restservice.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restservice.crud.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

	public Booking findByDeparture(String departure);
	
}
