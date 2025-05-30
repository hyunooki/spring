package com.yedam.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.Board;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.Criteria;
import com.yedam.common.PageDTO;

import lombok.RequiredArgsConstructor;
/*
 * 게시글 관리
 * 작성일자   작성자   수정내용
 * 20250525 홍길동   최초작성
 * 
 */ 
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardControl {
	
	final BoardService boardService;
	
	
	@GetMapping("/form")
	public String form() {
		return "home";   
	}
	
	@GetMapping("/list")
	public String examList(Criteria cri, Model model) {
		model.addAttribute("list",boardService.getList(cri));
		
		//paing 처리
				long total = boardService.getTotal(cri);
				model.addAttribute("pageMaker", new PageDTO(cri, total));
		return "board/list";
	}
	
	@GetMapping("/register")
	public String register() {
		return "board/register";
	}

	
	@PostMapping("/register")  
	public String list(Board board, RedirectAttributes rt) {
		if(boardService.insert(board)>0) {
			rt.addFlashAttribute("result",board.getBno());
			return "redirect:/board/list";
		}else {
			return "redirect:/board/register";
		}
	}
	
	@GetMapping("/findById")
	public String findById(@RequestParam("bno") int bno,Model model) {
		model.addAttribute("board",boardService.findById(bno));
		return "board/findById";
	}
	
	@GetMapping("/modify")
	public String modify(@RequestParam("bno") int bno,Model model) {
		model.addAttribute("board",boardService.findById(bno));
		return "board/modify";
	}
	
	@PostMapping("/modify")
	public String modify(Board board,RedirectAttributes rt) {
		boardService.update(board);
		rt.addAttribute("bno",board.getBno());
		return "redirect:/board/findById";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") int bno) {
		boardService.delete(bno);
		return "redirect:list";
	}
}
