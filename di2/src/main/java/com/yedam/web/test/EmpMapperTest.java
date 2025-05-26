package com.yedam.web.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
					   "classpath:/spring/mybatis-context.xml"})
public class EmpMapperTest {
	
	@Autowired
	EmpMapper empMapper;
	

	@Test
	public void 전제조회() {
		SearchVO svo = SearchVO.builder()
//				.departmentId("30")
//				.salary("3000")
				.ids(Arrays.asList(100,101,102))
				.build();
	    	
		empMapper.findAll(svo).forEach(emp -> System.out.println(emp.getEmployeeId()+":"+emp.getFirstName()));
	}
	
	//@Test
	public void 맵값조회() {
		empMapper.findAllToMap().forEach(emp -> System.out.println(emp.get("FIRST_NAME")));;
	}
	
	//@Test
	public void getCount() {
	  List<Employees> result = empMapper.getCount();
	 result.forEach(item -> System.out.println(item.getDepartmentId()+": "+item.getCnt())); 
	}
	
//	@Test
	public void insert() {
		
		Employees employees = Employees.builder()
				.employeeId("301")
				.lastName("shin")
				.email("dfsdf@naver.com")
				.hireDate("2014-05-04")
				.jobId("IT_PROG")
				.build();
		
		int result = empMapper.insert(employees);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Employees employees = new Employees();
		
		employees.setFirstName("hyun");
		employees.setEmployeeId("765");
		
		int result = empMapper.updateFirstName(employees);
		System.out.println(result);
	}
	
//	@Test
	public void delete() {
		int result = empMapper.delete("765");
		System.out.println(result);
	}
	
}
