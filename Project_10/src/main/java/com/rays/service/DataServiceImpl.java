package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DataDAOInt;
import com.rays.dto.DataDTO;

@Service
@Transactional
public class DataServiceImpl extends BaseServiceImpl<DataDTO, DataDAOInt> implements DataServiceInt{

}