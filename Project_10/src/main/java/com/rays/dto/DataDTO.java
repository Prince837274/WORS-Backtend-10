package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DATA")
public class DataDTO extends BaseDTO{
	
	@Column(name = "importLogCode", length = 50)
	private String importLogCode;
	
	@Column(name = "fileName", length = 50)
	private String fileName;
	
	@Column(name = "importedBy", length = 50)
	private String importedBy;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		
		return "importLogCode";
	}

	@Override
	public String getUniqueKey() {
	
		return "importLogCode";
	}

	@Override
	public String getUniqueValue() {
		
		return importLogCode;
	}

	@Override
	public String getLabel() {
		
		return "importLogCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("importLogCode", "asc");

		return map;	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("importLogCode", importLogCode);
		return map;
	}

}