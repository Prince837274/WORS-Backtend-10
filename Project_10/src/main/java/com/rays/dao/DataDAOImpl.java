package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DataDTO;

@Repository
public class DataDAOImpl extends BaseDAOImpl<DataDTO> implements DataDAOInt {

	@Override
	protected List<Predicate> getWhereClause(DataDTO dto, CriteriaBuilder builder, Root<DataDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getImportLogCode())) {

			whereCondition.add(builder.like(qRoot.get("importLogCode"), dto.getImportLogCode() + "%"));
		}
		
		if (!isEmptyString(dto.getFileName())) {

			whereCondition.add(builder.like(qRoot.get("fileName"), dto.getFileName() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<DataDTO> getDTOClass() {
		
		return DataDTO.class;
	}

}