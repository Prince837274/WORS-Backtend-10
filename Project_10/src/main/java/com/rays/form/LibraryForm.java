package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.LibraryDTO;

public class LibraryForm extends BaseForm {
	
	@NotEmpty(message = "Please Enter LibraryName")
	private String libraryName;
	
	@NotEmpty(message = "Please Enter Location")
	private String location;
	
	@NotNull(message = "Please Enter TotalBooks")
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
	public BaseDTO getDto() {
		LibraryDTO dto = initDTO(new LibraryDTO());
		
		dto.setLibraryName(libraryName);
		dto.setLocation(location);
		dto.setTotalBooks(totalBooks);
		
		
		return dto;
	}

}
