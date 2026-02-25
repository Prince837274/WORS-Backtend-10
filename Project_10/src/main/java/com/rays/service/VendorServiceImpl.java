package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VendorDAOInt;
import com.rays.dto.VendorDTO;

@Service
@Transactional
public class VendorServiceImpl  extends BaseServiceImpl<VendorDTO, VendorDAOInt> implements VendorServiceInt{

}
