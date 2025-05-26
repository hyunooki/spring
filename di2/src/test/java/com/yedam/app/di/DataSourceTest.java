package com.yedam.app.di;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/datasource-context.xml")
//(생성자 주입 방법)
//@RequiredArgsConstructor
public class DataSourceTest {
	//autowired (필드 주입법)
	@Setter(onMethod_ = {@Autowired}) // (Setter 주입 방법) 
	DataSource dataSource;
	
	@Test
	public void 데이터소스연결() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println(conn);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
