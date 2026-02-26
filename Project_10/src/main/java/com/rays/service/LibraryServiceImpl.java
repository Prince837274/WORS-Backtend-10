package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LibraryDAOInt;
import com.rays.dto.LibraryDTO;

@Service
@Transactional
public class LibraryServiceImpl  extends BaseServiceImpl<LibraryDTO, LibraryDAOInt> implements LibraryServiceInt{

}
