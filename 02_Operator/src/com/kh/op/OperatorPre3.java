package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	//public static void method1() 을 만들어서
	// Scanner 를 이용해 num1 num2 의 값을 입력받고
	// < > 를 사용해서 입력 받은 값이 < > 중 어떤 값에서 true 가 나오는지 확인하기
	// boolean result1 = num1 > num2;
	// boolean result2 = num1 >= num2;
	// boolean result3 = num1 < num2;
	// boolean result4 = num1 <= num2;
	
	// 응용편
	//public static void method2() num1 num2 num3 를 바독
	// && || 사용해서 크고 작은 값 확인하기
	// boolean result = (num1 < num2) && (num2 == num3) 참이 되는가?
	
	public static void method1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 값을 입력하세요. : ");
		int num2 = sc.nextInt();
	    
	    
	    boolean result1 = num1 > num2;
	    boolean result2 = num1 >= num2;
	    boolean result3 = num1 < num2;
	    boolean result4 = num1 <= num2;
	    
	    System.out.println("result1" + result1);
	    System.out.println("result2" + result2);
	    System.out.println("result3" + result3);
	    System.out.println("result4" + result4);
	    sc.close();
	
	}
	 public static void method2() {
	 
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("첫번째 값을 입력하세요. : ");
	 	int num1 = sc.nextInt();
	 	System.out.print("두번째 값을 입력하세요. : ");
	 	int num2 = sc.nextInt();
	 	System.out.print("세번째 값을 입력하세요. : ");
	 	int num3 = sc.nextInt();
	 	
	 	
	 	boolean result1 = (num1 > num2) && (num2 < num3);
	 	boolean result2 = (num1 < num2) && (num2 > num3);
	 	boolean result3 = (num1 >= num2) || (num2 <= num3);
	 	
	 	System.out.println("(num1 > num2) && (num2 < num3)의 결과는 " + result1);
	 	System.out.println("(num1 < num2) && (num2 > num3)의 결과는 " + result2);
	 	System.out.println("(num1 >= num2) || (num2 <= num3)의 결과는 " + result3);
	 	sc.close();
	    
	}
	
	public static void main(String[] args) {
		
		//method1();
		method2();
		
		
		
		
		
		
	}

}
