package com.rays.form;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.EventDTO;

public class EventForm  extends BaseForm{
	
	@NotEmpty(message = "please enter EventName")
	private String eventName;
	
	@NotNull(message = "please enter BookingDate")
	private Date bookingDate;
	
	@NotNull(message = "please enter Seats")
	private Long seats;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Long getSeats() {
		return seats;
	}

	public void setSeats(Long seats) {
		this.seats = seats;
	}
	
	@Override
	public BaseDTO getDto() {
		EventDTO dto = initDTO(new EventDTO());
		dto.setEventName(eventName);
		dto.setBookingDate(bookingDate);
		dto.setSeats(seats);
		
		
		return dto;
	}

}
