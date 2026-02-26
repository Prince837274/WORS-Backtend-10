package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;

import com.rays.dto.LibraryDTO;

@Repository
public class LibraryDAOImpl extends BaseDAOImpl<LibraryDTO> implements LibraryDAOInt{

	@Override
	protected List<Predicate> getWhereClause(LibraryDTO dto, CriteriaBuilder builder, Root<LibraryDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getLibraryName())) {

			whereCondition.add(builder.like(qRoot.get("libraryName"), dto.getLibraryName() + "%"));
		}
		
		if (!isEmptyString(dto.getLocation())) {

			whereCondition.add(builder.like(qRoot.get("location"), dto.getLocation() + "%"));
		}
		
		if (isNotNull(dto.getTotalBooks())) {
	        whereCondition.add(builder.equal(qRoot.get("totalBooks"), dto.getTotalBooks()));
	    }

		
		

		return whereCondition;
	}

	@Override
	public Class<LibraryDTO> getDTOClass() {
		return LibraryDTO.class;
	}

}