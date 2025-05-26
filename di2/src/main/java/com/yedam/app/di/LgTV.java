package com.yedam.app.di;

public class LgTV implements TV {
	

	private Speaker speaker;
	
	
	//기본생성자
	public LgTV() {
		System.out.println("===> LgTV");
	}
	//생성자
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
    public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}


	public void powerOn() {
        System.out.println("LgTV powerOn.");
    }
    
    public void powerOff() {
        System.out.println("LgTV powerOff.");
    }
    
    public void volumeUp() {
    	speaker.volumeUp();
    }
    
    public void volumeDown() {
    	speaker.volumeDown();
    }
    
}
