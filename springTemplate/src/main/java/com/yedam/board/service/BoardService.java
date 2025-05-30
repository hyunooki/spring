package com.yedam.board.service;

import java.util.List;

public interface BoardService  {
	public List<Board> getList(Criteria cri);
	
	public int insert(Board board);
	
	public Board findById(int bno);
	
	public int update(Board board);
	
	public int delete(int bno);
	
	public long getTotal(Criteria cri);
}
