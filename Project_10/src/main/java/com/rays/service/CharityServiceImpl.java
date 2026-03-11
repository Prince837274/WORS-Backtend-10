package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CharityDAOInt;
import com.rays.dto.CharityDTO;

@Service
@Transactional
public class CharityServiceImpl  extends BaseServiceImpl<CharityDTO, CharityDAOInt> implements CharityServiceInt{

}
