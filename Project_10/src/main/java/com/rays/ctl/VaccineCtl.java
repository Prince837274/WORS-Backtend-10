package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.VaccineDTO;
import com.rays.form.VaccineForm;
import com.rays.service.VaccineServiceInt;

@RestController
@RequestMapping(value = "Vaccine")
public class VaccineCtl extends BaseCtl<VaccineForm, VaccineDTO, VaccineServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Covishield");
		map.put(2, "Pfizer");
		map.put(3, "Covaxin");
		map.put(4, "Moderna");
		map.put(5, "BCG");
		map.put(6, "Polio");
		map.put(7, "Tetanus");
		map.put(8, "Hepatitis B");
	

		res.addResult("vaccineName", map);
		return res;
}
}
