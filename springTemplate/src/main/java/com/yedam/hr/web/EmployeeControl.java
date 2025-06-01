package com.yedam.hr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.hr.service.EmployeeService;
import com.yedam.hr.service.EmployeesVO;


@Controller
@RequestMapping("/employees")
public class EmployeeControl {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<EmployeesVO> result = service.findAll();
		model.addAttribute("emp",result);
		return "/emp/list";
	}
	
	
}
