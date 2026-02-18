package com.rays.dto;

import java.sql.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Vehical_Bean")
public class VehicalBeanDTO extends BaseDTO {
	
	@Column(name = "LAT" , length = 50)
	private Double lat;
	
	@Column(name = "LONG_ID" , length = 50)
	private Double longId;
	
	@Column(name = "VEHICAL_ID" , length = 50)
	private String vehicalId;
	
	@Column(name = "DATE" , length = 50)
	private Date date;
	

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLongId() {
		return longId;
	}

	public void setLongId(Double longId) {
		this.longId = longId;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		return null;
	}

}
