package com.yedam.hr.service;

import lombok.Data;
import oracle.sql.DATE;

@Data
public class EmployeesVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private DATE hireDate;
	private String jobId;
	private String salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;
	
}
