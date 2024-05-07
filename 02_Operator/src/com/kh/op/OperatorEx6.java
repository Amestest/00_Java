package com.kh.op;

public class OperatorEx6 {
	/*
	  증감 연산자 
	  +=
	  덧셈 연산을 수행하고 결과를 변수의 값으로 넣어주는 역할을 함
	  
	  -=
	  뺄셈 연산을 수행하고 결과를 변수의 값으로 넣어주는 역할을 함
	  
	  
	  이외에도 *= /= %= **== //==
	 
	 * */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// += 연산자를 활요한 예제
		System.out.println("======  [+=]  =======");
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		num1 += 3;
		// num1 = num1 +3;
		System.out.println("num1 += 3 을 해준 num1 의 값 : " + num1);
		
		num2 += num1; //num2 = num2 + num1;
		System.out.println("num1의 값 : " + num1 + " 과 num2의 값 : " + num2);
		System.out.println("======  [-=]  =======");
		int num4 = 10;
		int num5 = 5;
	
		num4 -= 2;  //num4 = num4 - 2 ;
		num5 -= num4;  //num5 = num5 - num4;
		System.out.println("num 4 의 값 : " + num4);
		System.out.println("num 5 의 값 : " + num5);
	
	}
	
	

}
