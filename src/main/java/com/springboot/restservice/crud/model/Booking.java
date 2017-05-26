package com.springboot.restservice.crud.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Booking implements Serializable{

	
	private static final long serialVersionUID = 1L;


	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long bookingId;
	
	private String passengerName;
	private String departure;
	private String destination;
	private Date tarvelDate;
	
	public Booking(){
		
	}
	
	public Booking(Long bookingId, String passengerName, String departure, String destination, Date tarvelDate) {
		super();
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.departure = departure;
		this.destination = destination;
		this.tarvelDate = tarvelDate;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTarvelDate() {
		return tarvelDate;
	}

	public void setTarvelDate(Date tarvelDate) {
		this.tarvelDate = tarvelDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", passengerName=" + passengerName + ", departure=" + departure
				+ ", destination=" + destination + ", tarvelDate=" + tarvelDate + "]";
	}
	
	
}
