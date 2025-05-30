package com.yedam.board.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
					   "classpath:/spring/mybatis-context.xml"})
public class BoardWeb {
	@Autowired
	BoardMapper boardMapper;
	
	
	
	//@Test
	public void insert() {
		Board board = Board
				      .builder()
				      .content("안녕")
				      .title("안녕")
				      .writer("현욱")
				      .build();
		
		int result = boardMapper.insert(board);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Board board = Board
			      .builder()
			      .bno(6)
			      .content("안녕")
			      .title("안녕")
			      .writer("현욱")
			      .build();
	  int result = boardMapper.update(board);
	  System.out.println(result);
	}
	@Test
	public void delete() {
		int result = boardMapper.delete(3);
	    System.out.println(result);
	}
	
}
