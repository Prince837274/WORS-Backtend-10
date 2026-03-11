package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "St_Charity")
public class CharityDTO  extends BaseDTO{
	
	@Column(name = "Donor_Name" , length = 50)
	private String donorName;
	
	@Column(name = "Donation_Amount" , length = 50)
	private Long donationAmount;
	
	@Column(name = "Donation_Date" , length = 50)
	private Date donationDate;
	
	@Column(name = "Purpose" , length = 50)
	private String purpose;
	

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public Long getDonationAmount() {
		return donationAmount;
	}

	public void setDonationAmount(Long donationAmount) {
		this.donationAmount = donationAmount;
	}

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return donorName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "donorName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return donorName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "donorName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("donorName", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("donorName", donorName);
		return map;
	}

}
