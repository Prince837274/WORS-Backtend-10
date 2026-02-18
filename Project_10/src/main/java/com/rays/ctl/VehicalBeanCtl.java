package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.common.UserContext;
import com.rays.dao.VehicalBeanDAOInt;
import com.rays.dto.VehicalBeanDTO;
import com.rays.form.VehicalBeanForm;
import com.rays.service.VehicalBeanServiceInt;

@RestController
@RequestMapping(value = "Vehical_Bean")
public class VehicalBeanCtl  extends BaseCtl<VehicalBeanForm, VehicalBeanDTO, VehicalBeanServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		
		
		return res;
}
}