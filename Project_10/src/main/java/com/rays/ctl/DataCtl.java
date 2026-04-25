package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.DataDTO;
import com.rays.form.DataForm;
import com.rays.service.DataServiceInt;

@RestController
@RequestMapping(value = "Data")
public class DataCtl extends BaseCtl<DataForm, DataDTO, DataServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}