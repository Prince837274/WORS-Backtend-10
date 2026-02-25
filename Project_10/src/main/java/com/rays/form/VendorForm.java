package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.VendorDTO;

public class VendorForm extends BaseForm {

	@NotEmpty(message = "Please Enter VendorCode")
	private String vendorCode;

	@NotEmpty(message = "Please Enter VendorName")
	private String vendorName;

	@NotEmpty(message = "Please Enter serviceType")
	private String serviceType;

	@NotNull(message = "Please Enter contactNumber")
	private Long contactNumber;

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public BaseDTO getDto() {
		VendorDTO dto = initDTO(new VendorDTO());

		dto.setVendorCode(vendorCode);
		dto.setVendorName(vendorName);
		dto.setServiceType(serviceType);
		dto.setContactNumber(contactNumber);

		return dto;
	}

}
