package com.yedam.company.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.company.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String main() {
		sampleService.sample("wer");
		return "home";
		
	}
	
	@GetMapping({"/all","/member","/admin","/accessError","/login"})
	public void all(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
	}
}
