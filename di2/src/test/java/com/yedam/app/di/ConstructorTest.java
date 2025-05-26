package com.yedam.app.di;

import org.junit.Test;

public class ConstructorTest {
	 
	@Test
	public void 기본생성자() {
		Employee emp = new Employee("길동",2000);
		emp.setLname("kim");
		System.out.println(emp);
		emp = new Employee("길동","홍",2000);
		System.out.println(emp);
	}
}
