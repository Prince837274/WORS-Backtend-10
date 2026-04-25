package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DataDTO;

public class DataForm extends BaseForm{
	
	@NotEmpty(message = "please enter importLogCode")
	private String importLogCode;
	
	@NotEmpty(message = "please enter fileName")
	private String fileName;
	
	@NotEmpty(message = "please enter importedBy")
	private String importedBy;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getImportLogCode() {
		return importLogCode;
	}

	public void setImportLogCode(String importLogCode) {
		this.importLogCode = importLogCode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getImportedBy() {
		return importedBy;
	}

	public void setImportedBy(String importedBy) {
		this.importedBy = importedBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public BaseDTO getDto() {
	 DataDTO dto = initDTO(new DataDTO());
	 dto.setImportLogCode(importLogCode);
	 dto.setFileName(fileName);
	 dto.setImportedBy(importedBy);
	 dto.setStatus(status);
		return dto;
	}
	

}