package com.yedam.board;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.Board;

public class BoardMapperTest {
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
	//@Test
	public void delete() {
		int result = boardMapper.delete(3);
	    System.out.println(result);
	}
	
}
