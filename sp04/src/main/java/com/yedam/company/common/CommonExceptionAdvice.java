package com.yedam.company.common;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j2;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {
	@ExceptionHandler(NoHandlerFoundException.class)
	public String handler404(Exception ex, Model model) {
		model.addAttribute("exception", ex);
		log.error(model);
		return "err404";
	}
	 @ExceptionHandler(Exception.class)
	 public String except(Exception ex, Model model) {
			model.addAttribute("exception", ex);
			log.error(model);
			return "err500";
		}
}
