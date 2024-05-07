package com.kh.operatorPre;
import java.util.Scanner;

public class OperatorPre {

	
	//2개릐 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면
	//true 아니면 false
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력 받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번재 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// == true == 양쪽에 있는 값이 같으면 true
		// 3 == 5 false 라고 표현
		// 5 == 5 true 라고 표현
		// != 양쪽에 있는 값이 다르지만 다른게 맞아! true
		// 3 != 5 true 라고 표현
		// 3 != 3 false 라고 표현
		// true false 표현할 때 그 값이 true false로 표현받기 위해서는
		// boolean 을 사용해서 표현을 함
		// 거짓 참을 담는 변수 = true or false;
		boolean result = num1 == num2;
		System.out.println("num1 과 num2의 결과 : " + result);
		
		
		
	}
	
	/* 실습문제 4번 응요
	 2개의 수를 키보드로 입력 받아 입력 바은 수가 모두 다르면 true 모두 같으면 false 출력
	 
	  
	 */
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. : ");
		int num3 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. : ");
		int num4 = sc.nextInt();
		boolean result = num3 != num4;
		System.out.println("num3 의 값 " + num3);
		System.out.println("num4 의 값 " + num4);
		System.out.println("num3 != num4 : "+ result);
		
		sc.close();
		
	}
	//practice5
	// 3개의 수를 키보드로 입력 받아
	// 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
	public static void practice5() {
		// 스캐너 출력해서 int 로 변수명 3개 만들기
		Scanner sc = new Scanner(System.in);
		//int 로 변수명 3개 만들기
		System.out.print("num1 의 값을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 의 값을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("num3 의 값을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		// ampersand   &&   and
		// 구분1 && 구분2 = true
		// (true) && (true) = true
		// (true) && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		//                  ┌  ture   ┐
		// num1이랑 num2가 같을 때 && num2 랑 num3가 같을 때
		boolean result = (num1 == num2) && (num2 == num3);
		
		// ||
		// 구분 1 or 구분2
		// (true) or (false) = true
		// (false) or (true) = true
		// (true) or (true) = true
		// (false) or (false) = false
		boolean isOR = (num1 == num2) || (num2 == num3);
		System.out.println("num1 : " + num1 + " ,num2 3: " + num2 + ", num3 : " + num3);
		System.out.println("result : " + result);
		System.out.println("isOR : " + isOR);
		
		
		
	}
	
	
	//메인 메서드 : 최종으로 실행하는 메서드
	public static void main(String[] args) {
		
		//method4();
		//practice4();
		practice5();
		
		
		
	}

}
