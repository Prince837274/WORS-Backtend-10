package com.rays.service;

import org.jfree.data.xy.VectorXYDataset;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VehicalBeanDAOInt;
import com.rays.dto.VehicalBeanDTO;

@Service
@Transactional
public class VehicalBeanServiceImpl extends BaseServiceImpl<VehicalBeanDTO, VehicalBeanDAOInt>  implements VehicalBeanServiceInt{

}
