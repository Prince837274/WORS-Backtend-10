package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LibraryDTO;
import com.rays.dto.MediaDTO;

public class MediaForm  extends BaseForm{
	
	@NotEmpty(message = "please enter  MediaCode")
	private String mediaCode;
	
	@NotEmpty(message = "please enter MediaType")
	private String mediaType;
	
	@NotEmpty(message = "please enter Status")
	private String status;

	public String getMediaCode() {
		return mediaCode;
	}

	public void setMediaCode(String mediaCode) {
		this.mediaCode = mediaCode;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
      MediaDTO dto = initDTO(new MediaDTO());
		
		dto.setMediaCode(mediaCode);
		dto.setMediaType(mediaType);
		dto.setStatus(status);
		
		
		return dto;	}
	

}
