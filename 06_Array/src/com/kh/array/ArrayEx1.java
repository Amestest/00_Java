package com.kh.array;
/*
 배열 (자료구조) 
 	같은 자료형의 변수를 하나의 묶음으로 다루는 것
 	생성된 배열은 index를 이용해서 구분
 	index : 시작숫자(0) 마지막숫자(마지막숫자 -1);
 	
 	생성된 배열을 활용하기 위해서는 배열을 참조하는 참조형 변수 이용
 	[참조형 변수] - 주소를 저장하는 변수
 	
 	- 소문자로 시작하는 자료형(int double 등) 제외한 나머지는 모두 참조형 변수
 	- 대표적인 참조형 변수 : String
  	
  	배열의 선언과 생성 방법
  	 정수 배열
  	 int[] numbers = new int[5];
  	 numbers 에는 숫자 5개를 넣을 수 있는 공간이 생성
 
 	 0 부터 4를 벗어난 자리에 숫자를 넣으면 오류남 
		  numbers[5] = 60;
		numbers[6] = 70;

  */
public class ArrayEx1 {

	public static void main(String[] args) {
		// 숫자 배열 선언 생성
		int[] numbers = new int[5];
		//int 5 라고 하는 것은
		//index : 0 1 2 3 4 
		//초기값  : 0 0 0 0 0 
		System.out.println(numbers);
		System.out.println(numbers[0]);
	
		numbers[0] = 10;
		
		System.out.println(numbers[0]);
		
		// 0 ~4 까지 자리에 10 20 30 40 50
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//글자를 7개 넣을 수잇는 index 0 ~ 6 생성
		String[] str = new String[7];
		
		str[0] ="월";
		str[1] ="화";
		str[2] ="수";
		str[3] ="목";
		str[4] ="금";
		str[5] ="토";
		str[6] ="일";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		System.out.println(str[6]);
	
		//2 ~ 6 수 목 금 토 일
		//System.out.println 출력해보기
	}
	
}
