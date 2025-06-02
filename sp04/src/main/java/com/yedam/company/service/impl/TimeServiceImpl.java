package com.yedam.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.company.mapper.TimeMapper;
import com.yedam.company.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService{

	@Autowired TimeMapper timeMapper;
	
	@Override
	public String getTime() {
		return timeMapper.getTime();
	}

	@Override
	public String getTime2() {
		return timeMapper.getTime2();
	}

}
