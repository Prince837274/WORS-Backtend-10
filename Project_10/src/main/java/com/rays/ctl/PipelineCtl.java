package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PipelineDTO;
import com.rays.form.PipelineForm;
import com.rays.service.PipelineServiceInt;

@RestController
@RequestMapping(value = "Pipeline")
public class PipelineCtl extends BaseCtl<PipelineForm, PipelineDTO, PipelineServiceInt> {
        
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "InActive");
		

		res.addResult("Pipelinelist", map);
		return res;

}
}
