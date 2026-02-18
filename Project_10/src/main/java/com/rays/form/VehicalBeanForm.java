package com.rays.form;

import java.sql.Date;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;
import com.rays.dto.VehicalBeanDTO;

public class VehicalBeanForm extends BaseForm {
	
	private Double lat;
	private Double longID;
	private String vehicalId;
	private Date date;
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLongID() {
		return longID;
	}
	public void setLongID(Double longID) {
		this.longID = longID;
	}
	public String getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(String vehicalId) {
		this.vehicalId = vehicalId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public BaseDTO getDto() {
		VehicalBeanDTO dto = initDTO(new VehicalBeanDTO());
		dto.setLat(lat);
		dto.setLongId(longID);
		dto.setVehicalId(vehicalId);
		dto.setDate(date);
		return dto;
	}

}
