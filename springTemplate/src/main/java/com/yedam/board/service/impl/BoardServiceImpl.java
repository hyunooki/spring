package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.Board;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.Criteria;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
	
	final BoardMapper boardMapper;
	@Override
	public List<Board> getList(Criteria cri) {
		
		return boardMapper.findAll(cri);
	}
	
	@Override
	public int insert(Board board) {
		return boardMapper.insert(board);
	}
	
	@Override
	public Board findById(int bno) {
		return boardMapper.findById(bno);
	}
	
	@Override
	public int update(Board board) {
		return boardMapper.update(board);
	}
	
	@Override
	public int delete(int bno) {
		return boardMapper.delete(bno);
	}
	 
	@Override
	public long getTotal(Criteria cri) {
		return boardMapper.getTotal(cri);
	}
}
