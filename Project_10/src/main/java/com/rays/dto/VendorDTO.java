package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Vendor")
public class VendorDTO extends BaseDTO {

	@Column(name = "vendorCode", length = 50)
	private String vendorCode;
	
	@Column(name = "vendorName", length = 50)
	private String vendorName;
	
	@Column(name = "serviceType", length = 50)
	private String serviceType;
	
	@Column(name = "contactNumber", length = 50)
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
	public String getValue() {
	    return vendorCode;
	}

	@Override
	public String getUniqueKey() {
	    return "vendorCode";
	}

	@Override
	public String getUniqueValue() {
	    return vendorCode;
	}

	@Override
	public String getLabel() {
	    return "vendorCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
	    LinkedHashMap<String, String> map = new LinkedHashMap<>();
	    map.put("vendorCode", "asc");
	    return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
	    LinkedHashMap<String, Object> map = new LinkedHashMap<>();
	    map.put("vendorCode", vendorCode);
	    return map;
	}
}