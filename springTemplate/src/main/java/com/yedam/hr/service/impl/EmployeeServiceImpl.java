package com.yedam.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.hr.mapper.EmployeeMapper;
import com.yedam.hr.service.EmployeeService;
import com.yedam.hr.service.EmployeesVO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeMapper mapper;
	
	@Override
	public List<EmployeesVO> findAll() {
	    List<EmployeesVO> employee = mapper.findAll();
		return employee;
	}
	@Override
	public EmployeesVO findById(int eno) {
		EmployeesVO employee = mapper.findById(eno);
		return employee;
	}
	@Override
	public int insert(EmployeesVO employee) {
		int result = mapper.insert(employee);
		return result;
	}
	@Override
	public int delete(int employee) {
		int result = mapper.delete(employee);
		return result;
	}
	@Override
	public int update(EmployeesVO employee) {
		int result = mapper.update(employee);
		return result;
	}
}
