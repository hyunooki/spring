package com.yedam.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping("/board/{bno}/replies")
public class ReplyControl {
	
	@Autowired
	private ReplyService replyService;
	
	//전체조회
	@GetMapping("")
	public List<ReplyVO> getList(
				@PathVariable("bno") Long bno){
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(5);
		return replyService.getList(cri, bno);
	}
	
	//등록
	@PostMapping("")
	public ResponseEntity<ReplyVO> create(@RequestBody ReplyVO vo ,@PathVariable("bno") Long bno) {
		
		ResponseEntity<ReplyVO> result = null;
		
		vo.setBno(bno);
		log.info("ReplyVO: "+vo);
		int insertCount = replyService.register(vo);
		log.info("Reply Insert Count: " + insertCount);
		//http status 지정
		if(insertCount==1) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
			
}
