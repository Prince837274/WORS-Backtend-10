package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PipelineDAOInt;
import com.rays.dto.PipelineDTO;

@Service
@Transactional
public class PipelineServiceImpl  extends BaseServiceImpl<PipelineDTO, PipelineDAOInt> implements PipelineServiceInt{

}
