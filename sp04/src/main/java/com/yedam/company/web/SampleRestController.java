package com.yedam.company.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody 포함

public class SampleRestController {
	
	@GetMapping("/api")
	public String main() {
		return "home";
	}
}
