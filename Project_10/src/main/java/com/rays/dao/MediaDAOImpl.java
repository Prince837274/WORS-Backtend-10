package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.MediaDTO;

@Repository
public class MediaDAOImpl extends BaseDAOImpl<MediaDTO> implements MediaDAOInt{

	@Override
	protected List<Predicate> getWhereClause(MediaDTO dto, CriteriaBuilder builder, Root<MediaDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMediaCode())) {

			whereCondition.add(builder.like(qRoot.get("mediaCode"), dto.getMediaCode() + "%"));
		}
		if (!isEmptyString(dto.getMediaType())) {

			whereCondition.add(builder.like(qRoot.get("mediaType"), dto.getMediaType() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		
		
		return whereCondition;	
	}

	@Override
	public Class<MediaDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return MediaDTO.class;
	}

}