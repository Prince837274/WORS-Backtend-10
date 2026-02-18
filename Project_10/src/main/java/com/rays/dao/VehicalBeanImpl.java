package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.VehicalBeanDTO;

@Repository
public class VehicalBeanImpl  extends BaseDAOImpl<VehicalBeanDTO> implements VehicalBeanDAOInt{

	@Override
	protected List<Predicate> getWhereClause(VehicalBeanDTO dto, CriteriaBuilder builder, Root<VehicalBeanDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getLat())) {

			whereCondition.add(builder.like(qRoot.get("lat"), dto.getLat() + "%"));
		}

		if (!isZeroNumber(dto.getLongId())) {

			whereCondition.add(builder.like(qRoot.get("longId"), dto.getLongId() + "%"));
		}

		if (isEmptyString(dto.getVehicalId())){

			whereCondition.add(builder.equal(qRoot.get("vehicalId"), dto.getVehicalId()));
		}

		if (!isNotNull(dto.getDate())) {

			whereCondition.add(builder.like(qRoot.get("date"), dto.getDate() + "%"));
		}

		
		return whereCondition;
	}
	

	@Override
	public Class<VehicalBeanDTO> getDTOClass() {
		
		return VehicalBeanDTO.class;
	}

}