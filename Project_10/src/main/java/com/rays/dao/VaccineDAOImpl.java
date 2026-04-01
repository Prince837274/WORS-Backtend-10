package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VaccineDTO;

@Repository
public class VaccineDAOImpl  extends BaseDAOImpl<VaccineDTO> implements VaccineDAOInt{

	@Override
	protected List<Predicate> getWhereClause(VaccineDTO dto, CriteriaBuilder builder, Root<VaccineDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getVaccineName())) {

			whereCondition.add(builder.like(qRoot.get("vaccineName"), dto.getVaccineName() + "%"));
		}
		if (!isEmptyString(dto.getManufacturer())) {

			whereCondition.add(builder.like(qRoot.get("manufacturer"), dto.getManufacturer() + "%"));
		}
		
		
		return whereCondition;
	}

	@Override
	public Class<VaccineDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return VaccineDTO.class;
	}

}
