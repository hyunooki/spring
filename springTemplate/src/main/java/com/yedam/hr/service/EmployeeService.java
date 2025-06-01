package com.yedam.hr.service;

import java.util.List;

public interface EmployeeService {
public List<EmployeesVO> findAll();
	
	public EmployeesVO findById(int eno);
	
	public int insert(EmployeesVO employee);
	
	public int update(EmployeesVO employee);
	
	public int delete(int employee);
}
