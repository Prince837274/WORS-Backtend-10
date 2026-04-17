package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;
import com.rays.dto.PipelineDTO;

public class PipelineForm  extends BaseForm {
	
	@NotEmpty(message = "please enter PipelineCode")
	private String pipelineCode;
	
	@NotEmpty(message = "please enter PipelineName")
	private String pipelineName;
	
	@NotEmpty(message = "please enter Tool")
	private String tool;
	
	@NotEmpty(message = "please enter Status")
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
	public BaseDTO getDto() {
		PipelineDTO dto = initDTO(new PipelineDTO());
		dto.setPipelineCode(pipelineCode);
		dto.setPipelineName(pipelineName);
		dto.setTool(tool);
		dto.setStatus(status);
		
		return dto;	}

}
