package com.rays.dto;


import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "St_Job")
public class JobDTO  extends BaseDTO{
	
	@Column(name = "Applicant_Name" , length = 50)
	private String applicantName;
	
	@Column(name = "Company_Name" , length = 50)
	private String companyName;
	
	@Column(name = "Position" , length = 50)
	private String position;
	
	@Column(name = "Application_Date" , length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return applicantName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "applicantName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return applicantName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "applicantName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("applicantName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("applicantName", applicantName);
		return map;
	}

}
