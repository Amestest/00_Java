package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	//메인 메서드 최종으로 실행하거나 출력하는 메서드
	public static void main(String[] args) {
		//멤버가 정보를 작성할 수 있는 공간을 만들고
		//공간에 멤버에 대한 정보를 작성할 수 있는
		//Member 객체 생성
		Member member1 = new Member();
		
		//이름 변경
		member1.changeName("동그라미");
		
		//변경된 이름 출력
		member1.printName();
		// null 안에 어떠한 값도 들어있지 않을 때 null 뜸
		
	}

}
