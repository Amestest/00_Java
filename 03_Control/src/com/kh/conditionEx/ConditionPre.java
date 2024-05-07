package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	/* public static void method1(){}
		// 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		같다면 같습니다. 출력하고
		같지 않다면 같지 않습니다. 출력하기
	*/
	/*public static void method2(){}
	 //if 문 활용 문자 값 2개 받아서 문자 두개가 일치하는지 확인
	  Scanner sc = new Scanner(System.in);
	  int str1 = sc.nextLine();
	  int str2 = sc.nextLine();
	  같다면 같습니다. 출력하고
	  같지 않다면 같지 않습니다. 출력하기
	 
	 
	 */
	 public static void method1() {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("첫번째 숫자를 입력하세요. : ");
	  System.out.print("두번째 숫자를 입력하세요. : ");
	  int num1 = sc.nextInt();
	  int num2 = sc.nextInt();
	  
	  if((num1 == num2)) {
		  System.out.println(num1 + " 과 " + num2 + "의 값이 같습니다.");
	  } else {
		  System.out.println(num1 + " 과 " + num2 + "의 값은 같지않습니다.");
	  }
	 }
	
	 
	 public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요. : ");
		System.out.print("두번째 숫자를 입력하세요. : ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println(str1 + " 과 " + str2 + "는 같습니다.");
		} else {
			System.out.println(str1 + "과" + str2 + "는 같지 않습니다.");
		}
		 
	 }
	 public static void method3() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 숫자를 입력하세요. : ");
		 System.out.print("두번째 숫자를 입력하세요. : ");
		 
		 
	 }
	 
	 
	//최종으로 실행할 메인 메서드
	public static void main(String[] args) {
		
			
		
		
	}

}
