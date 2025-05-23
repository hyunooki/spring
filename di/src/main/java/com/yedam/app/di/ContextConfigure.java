package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

//자바기반 설정
public class ContextConfigure {
	
	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	
	
	@Bean
	public TV tv() {
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker());
		return tv;
	}
	
	@Bean
	public TV tv2() {
		return new LgTV(speaker());
	}
}
