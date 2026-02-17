package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DeviceDTO;

@Repository
public class DeviceDAOImpl extends BaseDAOImpl<DeviceDTO> implements DeviceDAOInt {

    @Override
    protected List<Predicate> getWhereClause(DeviceDTO dto, CriteriaBuilder builder, Root<DeviceDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getDeviceSerialNumber())) {
            whereCondition.add(builder.like(qRoot.get("deviceSerialNumber"),
                    dto.getDeviceSerialNumber() + "%"));
        }

        

        return whereCondition;
    }

    @Override
    public Class<DeviceDTO> getDTOClass() {
        return DeviceDTO.class;
    }
}
