package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.JobDTO;

@Repository
public class JobDAOImpl extends BaseDAOImpl<JobDTO> implements JobDAOInt {

	@Override
	protected List<Predicate> getWhereClause(JobDTO dto, CriteriaBuilder builder, Root<JobDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getApplicantName())) {

			whereCondition.add(builder.like(qRoot.get("applicantName"), dto.getApplicantName() + "%"));
		}
		if (!isEmptyString(dto.getCompanyName())) {

			whereCondition.add(builder.like(qRoot.get("companyName"), dto.getCompanyName() + "%"));
		}
		
		
		return whereCondition;
	}
		
	@Override
	public Class<JobDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return JobDTO.class;
	}
}

	