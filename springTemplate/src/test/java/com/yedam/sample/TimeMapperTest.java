package com.yedam.sample;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyVO;
import com.yedam.sample.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class TimeMapperTest {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Autowired
	ReplyMapper replyMapper;
	
	//@Test
	public void testGetTime() {
		System.out.println(timeMapper.getClass().getName());
		System.out.println(timeMapper.getTime());
	}
	
	//@Test
	public void testCreate2() {
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(5L);
		vo.setReply("댓글리스트");
		vo.setReplyer("replyer");
		
		int r = replyMapper.insert(vo);
		System.out.println(r);
	}
	
	//@Test
	public void testLoad() {
		Long targetRno = 2L;
		ReplyVO vo = replyMapper.read(targetRno);
		log.info(vo);
	}
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(5);
		List<ReplyVO> replies = replyMapper.getList(cri, 5L);
		replies.forEach(reply -> log.info(reply));
	}
	
}
