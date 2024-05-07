package com.kh.practice.charCheck.exception;
					//Exception 을 상속받아 개발자가 원하는 예외 상황을 만ㄷ르 수 잇음
public class CharCheckException extends Exception{
	
//생성자 : 기본	
	public CharCheckException() {
		super();
		}
//생성자 : 필수 - 어떤 문자가 들어오면 Exception 참조해서 처리하겠다.	
	public CharCheckException(String msg) {
		super(msg);
	}
}
