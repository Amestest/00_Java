package com.kh.variable.ex;
//VariableEx4 → 상수Ex
public class 상수Ex {
	// 메인 메서드 :  자바 프로그램 실행하는 구문
	public static void main(String[] args) {
		// 상수 : 한 번 값을 기록하면 값을 바꿀수 없는 변수
		// 상수 키워드 : final
		
		// 상수명 작성 : 대문자로 작성, 연결되는 단어 사이는 _ 구문
		// 상수를 대문자로 표기하는 것은 자바에서 개발자간의 규칙
		final double PI = 3.1415926538;
		System.out.println("상수로 표기한 PI :" + PI);
		
		// MIN 가장 최소값
		final int MIN = 0;
		final int MAX = 100;
		
		//상루로 지정된 값을 변경하려하면 에러가 발생
		//MIN = 1; // 사용할 수 없음
		
		//상수 final을 사용해서
		//String 으로 "hello World" 넣어보기
		//우리 회사에 들어오는 사람들한테는
		//Hello World 문구로 부여주고 변경되게 하고 싶지 않을 때
		final String GREETING = "Hello World";
		System.out.println(GREETING);
		
		
	}

}
