package com.yedam.app.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//캡슐화
@Data
@AllArgsConstructor
//@NoArgsConstructor
//필요할때만 객체를 주입 final을 붙이면 그 변수 생성자를 활용
@RequiredArgsConstructor
public class Employee {
	  private final String fname;
	  private String lname;
	  private final int salary;
	  
	

	  
      

}
