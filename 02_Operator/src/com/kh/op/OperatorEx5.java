package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		 비교 연산자
		 == : 서로 같으면 true
		    예를 들어
		          5 == 5 true
		          3 == 5 false
		          5 == 3 false
		 != : 서로 다르면 true
		     예를 들어
		          5 != 5 false
		          3 != 5 true
		          5 != 3 true
		 
		 논리 연산자
		 &&  : 왼쪽 오른쪽 두 개의 조건이 모두 참일 때만 전체 표현이 참
		    예를 들어
		        (5 == 5) && (5 == 5) true
		 		(5 != 3) && (3 == 3) true
		 		(5 == 5) && (5 == 3) false
		 		(3 == 5) && (5 == 5) false
		 || : 왼쪽 오른쪽 둘 중 하나라도 참이면 참
	 		예를 들어
	 			(5 == 5) || (5 == 5) true
	 			(5 == 5) || (5 == 3) true
	 			(5 == 3) || (3 == 3) true
	 			(5 == 3) || (3 == 5) false
	 			
	 	비교 연산자 > < >= <=
	 	왼쪽 > 오른쪽 : 오른쪽의 값보다 왼쪽이 크면 true
	 				  왼쪽이랑 오른쪽이 초과나 미만일 때 사용하는 표현
	 	왼쪽 >= 오른쪽 : 오른쪽의 값보다 왼쪽이 크거나 같으면 true
	 	 			   왼쪽이랑 오른쪽이 이상 이하 처럼 같을 때도 사용하는 표현
	 	왼쪽 < 오른쪽 : 오른쪽의 값이 왼쪽보다 크면 true
	 				  왼족이랑 오른쪽이 초과나 미만일 때 사용하는 표현
	 				  
	 	왼쪽 <= 오른쪽 : 오른쪽 값이 왼쪽보다 크거나 같으면 true
	 				   왼쪽이랑 오른쪽이 이상 이하처럼 같을 때도 사용하는 표현
	 				   
	 	 */
		int num1 = 10;
		int num2 = 20;
		
		//num1 num2 값이 1. 같은지 2. 다른지 3. 어떤 값이 더 큰지
		//1. num1 == num2
		//true false
		boolean result1 = num1 == num2; //num1 num2 가 같다면 참
		boolean result2 = num1 != num2; //num1 num2 가 다르다면 참
		boolean result3 = num1 < num2; //num2가 num1보다 크다면 참
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
	}

}
