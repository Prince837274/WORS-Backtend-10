package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PipelineDTO;

@Repository
public class PipelineDAOImpl  extends BaseDAOImpl<PipelineDTO> implements PipelineDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PipelineDTO dto, CriteriaBuilder builder, Root<PipelineDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPipelineName())) {

			whereCondition.add(builder.like(qRoot.get("pipelineName"), dto.getPipelineName() + "%"));
		}
		if (!isEmptyString(dto.getTool())) {

			whereCondition.add(builder.like(qRoot.get("tool"), dto.getTool() + "%"));
		}
		
		
		
		return whereCondition;	}

	@Override
	public Class<PipelineDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PipelineDTO.class;
	}

}
