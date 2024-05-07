package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	  do-while : do에서 while 조건에 상관없이 무조건 한 번은 실행 
	  			조건이 false 여도 최초 1회는 무조건 실행
	  사용 예제 : 
	  do {
	  		수행될 문장;
	  	} while(조건식);
	 * */
	
	public static void main(String[] args) {
		int count = 1;
		
		do {
			System.out.println("숫자값 : " + count);
			//조건에 대한 증감식을 추가하기도 함
			count++;
		}while(count <= 5);
		
		
	}
	
	
}
