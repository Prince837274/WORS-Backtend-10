package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CharityDTO;

@Repository
public class CharityDAOImpl extends BaseDAOImpl<CharityDTO>  implements CharityDAOInt{

	@Override
	protected List<Predicate> getWhereClause(CharityDTO dto, CriteriaBuilder builder, Root<CharityDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDonorName())) {

			whereCondition.add(builder.like(qRoot.get("donorName"), dto.getDonorName() + "%"));
		}
		if (!isEmptyString(dto.getPurpose())) {

			whereCondition.add(builder.like(qRoot.get("purpose"), dto.getPurpose() + "%"));
		}
		
		
		return whereCondition;
		
	}

	@Override
	public Class<CharityDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return CharityDTO.class;
	}

	

	

}
