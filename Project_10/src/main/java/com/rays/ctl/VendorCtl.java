package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;

import com.rays.dto.VendorDTO;

import com.rays.form.VendorForm;

import com.rays.service.VendorServiceInt;

@RestController
@RequestMapping(value = "Vendor")
public class VendorCtl extends BaseCtl<VendorForm, VendorDTO, VendorServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "IT Services");
		map.put(2, "Software Development");
		map.put(3, "Hardware Supply");

		res.addResult("serviceType", map);
		return res;
	}
}