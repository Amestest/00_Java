package com.kh.interfaceEx;
/*
클래스, 추상 클래스를 상속 : extends (확장하다)
인터페이스 상속 : implements(구현하다)
추상클래스 - 미완선된 값을 가지고 변경하고 확장하는게 목표
인터페이스 - 정해진 값을 가지고 클래스를 완성하는게 목표
*/
public class 컴퓨터 implements 기계{
	//기계 인터페이스에 미완성(abstract) 된 메서드를 컴퓨터로 가지고 와서
	//미완성된 모든 메서드를 완성시켜주면 class에 표시된 빨간 줄이 사라짐
	public void 전원켜기() {
		System.out.println("컴퓨터의 power 버튼을 눌러서 킨다.");
	}
	
	public void 전원끄기() {
		System.out.println("컴퓨터의 power 전원을 눌러서 끈다.");
	}
	
}
