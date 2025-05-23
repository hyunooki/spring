package com.yedam.app.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Component("tv")
public class SamsungTV implements TV {
	
	//필드 주입 방법
//	@Autowired
	@Setter(onMethod_ = {@Autowired})
	private Speaker speaker;
	
	
	
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
