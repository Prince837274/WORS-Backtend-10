package com.rays.dto;

import java.sql.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "St_Event")
public class EventDTO  extends BaseDTO{
	
	@Column(name = "Event_Name", length = 50)
	private String eventName;
	
	@Column(name = "Bookin_Date" , length = 50)
	private Date bookingDate;
	
	@Column(name = "SEATS" , length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return eventName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "eventName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return eventName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "eventName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
	    map.put("eventName", "asc");
	    return map;
	}
	
	

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
	    map.put("eventName", eventName);
	    return map;
	}

}
