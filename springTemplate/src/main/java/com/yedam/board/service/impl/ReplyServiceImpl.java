package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	
	@Autowired
	ReplyMapper replyMapper;
	
	@Override
	public ReplyVO get(Long rno) {
		ReplyVO reply = replyMapper.read(rno);
		return reply;
	}
	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		List<ReplyVO> reply = replyMapper.getList(cri, bno);
		return reply;
	}
	@Override
	public int register(ReplyVO vo) {
		return replyMapper.insert(vo);
	}
	@Override
	public int modify(ReplyVO vo) {
		
		return replyMapper.update(vo);
	}
	@Override
	public int remove(Long rno) {
		
		return replyMapper.delete(rno);
	}
}
