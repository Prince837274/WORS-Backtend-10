package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Vaccine")
public class VaccineDTO extends BaseDTO {
	
	@Column(name = "VaccineName", length = 50)
	private String vaccineName;
	
	@Column(name = "Manufacturer", length = 50)
	private String manufacturer;
	
	@Column(name = "ExpiryDate", length = 50)
	private Date expiryDate;

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return vaccineName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "vaccineName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return vaccineName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "vaccineName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("vaccineName", "asc");
		
		return map;	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("vaccineName", vaccineName);
		return map;
	
	}

}
