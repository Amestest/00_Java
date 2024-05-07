package com.kh.variable.ex;
// VariableEx1 → 자료형Ex
public class 자료형EX {

	public static void main(String[] args) {
		// 변수 :  메모리에 값을 저장하기 위한 공간
		//		  저장되는 값이 변할 수 있기 때문에 변수
		
		//자료형 : 변수 또는 값의 크기나 형식을 결정
		
		/*
		 자바에서 기본으로 제공하는 자료형
		 [논리형]
		 boolean (1byte) - true / false 기본값 false
		 
		 [정수형]
		 byte  (1byte)
		 short (2byte)
		 int   (4byte) - 정수 기본형
		 long  (8byte)
		 
		 [실수형]
		 float  (4byte) - 숫자 뒤에 f 나 F 를 붙여줘야함
		 double (8byte) - 실수 기본형
		 
		  [문자형]
		  char   (2byte) - 문자 하나, 문자 양 옆에 ' ' 사용
		  
		  참조형 :  자바에서 기본은 아니지만 기본이 된 문자열
		  [문자열]
		  String 크기를 특정하게 지정할 수 없음
		         - 표현 방법 문자열 양 옆에 " " 사용
		         
		 // 변수 선언 : 메모리에 공간을 할당
		 // 값 대입 : 변수에 값을 집어넣는 것
		 // 변수를 선얼할 때 자료형은 변수명마다 최초 1회만 선언
		 * */
		//자료형    변수선언    =   값 대입   ;(종료)
		  int     number    =   1;
		// 변수명에 들어있는 숫자를 변경하고 싶다면
		//변경 가능 변경할 때, 자료형은 사용하지 않음
		    number = 3;
		//number 안에는 1 대신 3이 들어가 있음
	}

}
