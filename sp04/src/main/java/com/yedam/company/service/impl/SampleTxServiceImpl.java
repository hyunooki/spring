package com.yedam.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.company.mapper.Sample1Mapper;
import com.yedam.company.mapper.Sample2Mapper;
import com.yedam.company.service.SampleTxService;

import jakarta.transaction.Transactional;

@Service
public class SampleTxServiceImpl implements SampleTxService{
	
	@Autowired
	Sample1Mapper mapper1;
	
	@Autowired
	Sample2Mapper mapper2;
	
	@Override
	@Transactional
	public void addData(String value) {
		mapper1.insertCol1(value);
		
		mapper2.insertCol2(value);
	}
	
}
