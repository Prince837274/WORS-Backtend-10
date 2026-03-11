package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;
import com.rays.dto.CharityDTO;

public class CharityForm extends BaseForm {

	@NotEmpty(message = "please enter DonorName")
	private String donorName;

	@NotNull(message = "please enter donationAmount")
	private Long donationAmount;

	@NotNull(message = "please enter donationDate")
	private Date donationDate;

	@NotEmpty(message = "please enter Purpose")
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
	public BaseDTO getDto() {
		CharityDTO dto = initDTO(new CharityDTO());
		dto.setDonorName(donorName);
		dto.setDonationAmount(donationAmount);
		dto.setDonationDate(donationDate);
		dto.setPurpose(purpose);

		return dto;
	}

}
