package com.yedam.company.common.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component //빈으로 등록
@Aspect   //advice 모여있는 클래스
public class LogAdvice {
	
	@Pointcut("execution(* com.yedam.company..*Impl.*(..))")
	public void allPointCut() {}
	//Advice 메서드
	@Before("allPointCut()")  
	public void logprint(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		log.info("[before]서비스 호출"+methodName);
		
		Object[] args =  jp.getArgs();
		if(args != null && args.length>0) {
			log.info("파라미터 : "+args[0].toString());
		}
	}
	
	@AfterReturning("allPointCut()")  
	public void afterPrint() {
		log.info("[after]서비스 호출");
	}
	
	@Around("execution(* com.yedam.company..*Impl.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		
		log.info("Target: "+ pjp.getTarget());
		log.info("Param: "+Arrays.toString(pjp.getArgs()));
		
		Object result = null;
		
		try {
			result = pjp.proceed();
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		log.info("TIME: "+(end-start));
		
		return result;
	}
}
