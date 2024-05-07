package com.kh.Inheritance.OverrideEx;

public class 동물 {
//필드	
	String 이름; //alt + shift + s
//메서드
	//Setter
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	//Getter
	public String get이름() {
		return 이름;
	}

	//생성자
	public 동물() {
		
		
	}
	
	//생성자 : 필수
	public 동물(String 이름) {
		this.이름 = 이름;
		
	}
	
	//void : 반환하는 값 없이 출력만 진행
	public void 소리() {
		System.out.println("동물이 소리를 냅니다.");
	}

}
