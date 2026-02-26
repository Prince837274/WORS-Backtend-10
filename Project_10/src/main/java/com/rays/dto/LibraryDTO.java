package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LIBRARY")
public class LibraryDTO  extends BaseDTO {
	
	@Column(name = "LIBRARY_NAME", length = 50)
	private String libraryName;
	
	@Column(name = "LOCATION", length = 50)
	private String location;
	
	@Column(name = "TOTALBOOKS", length = 50)
	private Long totalBooks;
	

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(Long totalBooks) {
		this.totalBooks = totalBooks;
	}
	@Override
	public String getValue() {
	    return libraryName;
	}

	@Override
	public String getUniqueKey() {
	    return "libraryName";
	}

	@Override
	public String getUniqueValue() {
	    return libraryName;
	}

	@Override
	public String getLabel() {
	    return "libraryName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
	    LinkedHashMap<String, String> map = new LinkedHashMap<>();
	    map.put("libraryName", "asc");
	    return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
	    LinkedHashMap<String, Object> map = new LinkedHashMap<>();
	    map.put("libraryName", libraryName);
	    return map;
	}
}

	