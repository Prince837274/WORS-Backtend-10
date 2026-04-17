package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Pipeline")
public class PipelineDTO  extends BaseDTO{
	
	@Column(name = "PipelineCode", length = 50)
	private String pipelineCode;
	
	@Column(name = "PipelineName" , length = 50)
	private String pipelineName;
	
	@Column(name = "Tool" , length = 50)
	private String tool;
	
	@Column(name = "Status", length = 50)
	private String status;
	

	public String getPipelineCode() {
		return pipelineCode;
	}

	public void setPipelineCode(String pipelineCode) {
		this.pipelineCode = pipelineCode;
	}

	public String getPipelineName() {
		return pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
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
		return pipelineCode;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "pipelineCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return pipelineCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "pipelineCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("pipelineCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("pipelineCode", pipelineCode);
		return map;

	}

}
