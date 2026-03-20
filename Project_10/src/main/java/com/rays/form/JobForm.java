package com.rays.form;



import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;
import com.rays.dto.JobDTO;

public class JobForm  extends BaseForm{
	
	@NotEmpty(message = " please enter ApplicationName")
	private String applicantName;
	
	@NotEmpty(message = "please enter CompanyName")
	private String companyName;
	
	@NotEmpty(message = "please enter Position")
	private String position;
	
	@NotNull(message = "please enetr ApplicationDate")
	private Date applicationDate;

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	@Override
	public BaseDTO getDto() {
		JobDTO dto = initDTO(new JobDTO());
		dto.setApplicantName(applicantName);
		dto.setCompanyName(companyName);
		dto.setPosition(position);
		dto.setApplicationDate(applicationDate);
		
		return dto;
	}

}
