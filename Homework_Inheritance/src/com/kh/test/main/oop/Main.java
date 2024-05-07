package com.kh.test.main.oop;

public class Main {
	//최종으로 실행할 메인 메서드 정말 내가 실행하고자하는 파일과 코드만 작성
	public static void main(String[] args) {
		
		Dog 해피 = new Dog();
		
		Dog 러브 = new Dog();
		
		Dog 희망 = new Dog();
		
		//해피와 러브와 희망이의 인사소리를 들어봅기
		//인터페이스 메서드에 작성한 makeSound를 Dog에서 재 작성한 소리로 변경한 것을 듣는것
		해피.makeSound();
		러브.makeSound();
		희망.makeSound();
	}
}
