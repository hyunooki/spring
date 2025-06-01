package com.yedam.hr.mapper;

import java.util.List;

import com.yedam.hr.service.EmployeesVO;

public interface EmployeeMapper {
	
	public List<EmployeesVO> findAll();
	
	public EmployeesVO findById(int eno);
	
	public int insert(EmployeesVO employee);
	
	public int update(EmployeesVO employee);
	
	public int delete(int employee);
}
