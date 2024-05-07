package com.kh.loop.ex;

public class LoopFor {
	/*
	 for 문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문
	 특정 조건을 만족하는 동안 { } 코드 블록을 반복해서 실행 
	 반복 횟수가 일정하게 정해진 경우 많이 사용
	  
	  
	  사용예제
	  for (초기식 ;  조건식 ; 증감식){
	  
	  	//조건이 맞을 경우 반복해서 실행될 코드 블록
	  }
	  
	  //for문에서 조건이 맞지 않으면 for문을 탈출
	   
	   
	   
	 for - each 문
	 배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
	 조건 반복이 처음부터 끝까지 모두 반복
	 
	 사용 예제
	 
	 for(자료형 변수명 생성 : 반복해서 보여주고자 하는 변수명){
	 	// 실행하고자 하는 작업 작성
	 	 System.out.println(생성된 변수명 작성);
	 
	 }
	 
	 
	  
	 */
	
	
	

	public static void main(String[] args) {
		//int i = 1;
		/*
		 for ( 초기 식의 값이기 때문에 i라고 작성을 해줄수 없음
		 무조건
		 for( 지정값 변수명  = 변수의 초기수숫자 ;  조건  ;  증감식   )
		 작성해줘야함
		 for (    i  ;   i <= 2  ; i++  ){
		 	System.out.pirntln(" i의 값 : " + i);
		 } 
		  
		 * */
		
		for (int i = 1 ;  i <= 2; i ++) {
			System.out.println(i);
		}
		System.out.println("===== for 문 2번 ===== ");
		
		for(int a =1; a <= 3; a++) {
			System.out.println("a의 값 : " + a);
		}
		
		System.out.println("===== for 문 3번 ====");
		//int 값을 num =1 로 준후
		//num의 값이 1부터 5까지 나오도록 출력
		for(int num = 1; num <=5; num++){
			System.out.println(" num의 값 " + num);
		}
		System.out.println("===== for 문 4번 ====");
		//1부터 10까지 짝수만 출력해보기
		//int 값을 num = 2로 준 후 
		//증감식에서 num += 2 준 다음 출력해보기
		for(int num1 = 2; num1 <= 10; num1 +=2) {
			System.out.println("num1의 값 " + num1);
		}
		//for문 구구단 5단 출력하기
		// 단의 값이 5임을 표시
		int dan = 5;
				// 
		for(int i = 1; i <= 9; i++) {
		      System.out.println(dan + "단 * " + i + " = " + (dan * i));          
		   }
		// 실습문제 6번
				System.out.println("===== for 6번 =====");
				// 구구단에서 3단을 9번까지 출력하기
				// 처음 3 * 1 = 3 마지막은 3 * 9 = 27;
				// int dandan = 3;
				// num = 1;
				int dandan = 3;
		  for(int num = 1; num<=9; num++) {
			  System.out.println(dandan + " * " + num + " = " + (dandan * num));
			  
		  }
				
		  
				
	}
		
		



}
