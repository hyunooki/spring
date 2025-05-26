package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {
	
	List<Employees> findAll(SearchVO search);
	
	List<Map> findAllToMap();
	
	List<Employees> getCount();
	
	int insert(Employees employee);
	
	int updateFirstName(Employees employee);
	
	int delete (String eno);
}
