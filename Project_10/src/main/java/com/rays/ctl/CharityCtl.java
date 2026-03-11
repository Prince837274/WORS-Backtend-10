package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CharityDTO;
import com.rays.form.CharityForm;
import com.rays.service.CharityServiceInt;

@RestController
@RequestMapping(value = "Charity")
public class CharityCtl  extends BaseCtl<CharityForm, CharityDTO, CharityServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Orphanage Support");
		map.put(2, "Education Support");
		map.put(3, "Old Age Home Support");

		res.addResult("Purpose", map);
		return res;
	
}
}
