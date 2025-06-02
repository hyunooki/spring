package com.yedam.company.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.Setter;

@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class SampleTxServiceTest {	
	
	@Setter(onMethod_ = @Autowired)
	private SampleTxService service;
	@Setter(onMethod_ = @Autowired)
	private SampleService sampleService;
	
	//@Test
	public void testTran() {
		service.addData("12312321321123213");
	}
	
	@Test
	public void test() {
		sampleService.sample("홍길동");
	}
}
