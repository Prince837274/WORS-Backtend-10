package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.JobDTO;
import com.rays.dto.VaccineDTO;

public class VaccineForm extends BaseForm {
	
	@NotEmpty(message = "Please enter  VaccineName")
	private String vaccineName;
	
	@NotEmpty(message = "Please enter Manufacturer")
	private String manufacturer;
	
	@NotNull(message = "please enter ExpiryDate")
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
	public BaseDTO getDto() {
		VaccineDTO dto = initDTO(new VaccineDTO());
		dto.setVaccineName(vaccineName);
		dto.setManufacturer(manufacturer);
		dto.setExpiryDate(expiryDate);
		
		
		return dto;	}

}
