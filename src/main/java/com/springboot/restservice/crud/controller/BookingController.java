package com.springboot.restservice.crud.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restservice.crud.dao.BookingRepository;
import com.springboot.restservice.crud.model.Booking;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingRepository bookingRepository;

	private static final String template = "Hello, %s!";

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new ResponseEntity<>(String.format(template, name), HttpStatus.OK);
	}

	@RequestMapping(value = "/newbooking", method = RequestMethod.POST)
	public Booking createBooking(@RequestBody Booking booking) {

		booking.setTarvelDate(new Date());
		return bookingRepository.save(booking);

	}

	@RequestMapping("/bookinginfo")
	public Booking getBookingInfoById(@RequestParam Long bookingId) {

		return bookingRepository.findOne(bookingId);
	}

	@RequestMapping("/update")
	public Booking update(@RequestParam Long bookingId, @RequestParam String passengerName) {

		Booking booking = bookingRepository.findOne(bookingId);
		booking.setPassengerName(passengerName);

		return bookingRepository.save(booking);

	}

	public String delete(@RequestParam Long bookingId) {

		bookingRepository.delete(bookingId);

		return "booking #" + bookingId + "deleted successfully";

	}

}
