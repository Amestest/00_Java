package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
	//메인 메서드 호출
	public static void main(String[] args) {
		//int a = 1;
		//int b = 3;
		//내가 스캐너로 입력받은 값이 출력되게 해봅시다.
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요.계산기입니다.");
		System.out.print("a값을 입력하세요.");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요.");
		int b = sc.nextInt();
		
		//덧셈
		int sum = a+b;
		System.out.println("덧셈 결과 sum : "+ sum);
		//뺄셈
		int dif = a-b;
		System.out.println("뺄셈 결과 dif : " + dif);
		//곱셈
		int mul = a*b;
		System.out.println("곱셈 결과 mul :" + mul);
		//나눗셈
		int div = b/a;
		System.out.println("나눗셈 결과 div : " + div);
	}

}
