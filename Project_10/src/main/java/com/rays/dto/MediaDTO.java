package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Media")
public class MediaDTO extends BaseDTO {
	
	@Column(name = "MediaCode" , length = 50)
	private String mediaCode;
	
	@Column(name = "MediaType" , length = 50)
	private String mediaType;
	
	@Column(name = "Status" , length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return mediaCode;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "mediaCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return mediaCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "mediaCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("mediaCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("mediaCode", mediaCode);
		return map;
	}

}
