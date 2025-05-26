package com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yedam.app.di.ContextConfigure;

public class App {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		ApplicationContext context = 
   			 new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		BoardController contoller = (BoardController)context.getBean("board");
		contoller.insert();
	}
}
