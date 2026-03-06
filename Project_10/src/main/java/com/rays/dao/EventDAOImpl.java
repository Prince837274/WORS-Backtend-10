package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EventDTO;

@Repository
public class EventDAOImpl  extends BaseDAOImpl<EventDTO> implements EventDAOInt{

	@Override
	protected List<Predicate> getWhereClause(EventDTO dto, CriteriaBuilder builder, Root<EventDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEventName())) {

			whereCondition.add(builder.like(qRoot.get("eventName"), dto.getEventName() + "%"));
		}
		if (isNotNull(dto.getSeats())) {
	        whereCondition.add(builder.equal(qRoot.get("seats"), dto.getSeats()));
	    }

		
		
		return whereCondition;
	}

	@Override
	public Class<EventDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return EventDTO.class;
	}

}
