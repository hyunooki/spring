package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.board.service.Board;
import com.yedam.board.service.Criteria;

public interface BoardMapper {
	public List<Board> findAll(Criteria cri);
	
	public int insert(Board board);
	
	public int update(Board board);
	
	public int delete(int bno);
	
	public Board findById(int bno);
	
	public long getTotal(Criteria cri);
}
