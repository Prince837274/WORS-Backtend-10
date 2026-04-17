package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MediaDAOInt;
import com.rays.dto.MediaDTO;

@Service
@Transactional
public class MediaServiceImpl extends BaseServiceImpl<MediaDTO, MediaDAOInt> implements MediaServiceInt {

}
