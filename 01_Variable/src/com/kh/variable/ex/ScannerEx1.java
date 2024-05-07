package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		/*
		  Scanner 클래스
		 
		 
		 사용자로부터 키보드 입력을 받기위해
		 Java에서 제공하는 클래스
		 
		 기본으로 구성되어있는 것은 아님
		 import java.util 패키지 표기를 해준 후 사용 할 수 있음
		 import 정확한 표기 법 : import java.util.Scanner;
		 import 는 가져온다는 의미
		 
		 
		 Scanner.next() : 공백없이 단어(String) 1개 입력 가능
		 
		 Scanner.nextLing() : 공백포함해서 문자열 1개 입력 
		 
		 Scanner.nextInt() : int형 정수 1개 입력
		 Scanner.nextLong() : long 형 정수 1개 입력
		 Scanner.nextDouble() : 실수 1개 입력
		 
		 이외에 Scanner 클래스 안에는 여러가지 기능이 존재
		 스캐너는 불로온 다음 close를 사용해서 공간을 닫아주는 표시를 해주는게 좋음
		*/
		
		
		// Scanner 사용 하기
		
		// 1. 클래스 위에 import 구문이 생겨야함
		
		// 2. Scanner 객체 사용
		Scanner sc = new Scanner(System.in);
		// 3. System.in 키보드로 입력하는 값을 받을 수 있도록 함
		System.out.print("정수 입력 1 : ");
		int num1 = sc.nextInt(); //다음에 입력된 정수를 가져와 num1 대입
		
		System.out.print("정수 입력 2 : ");
		int num2 = sc.nextInt(); // 다음에 입력된 정수를 가져와 num2 대입
		
		// 실수 입력 nextDouble을 사용해서 num3 값에 실수 입력 만들기
		System.out.print("실수 입력 : ");
		double num3 = sc.nextDouble();
		
		// 단어 입력 2개 하기 next 사용해서 변수명 word1 word2
		System.out.print("단어 입력 2개 하기 : ");
		String word1 = sc.next();
		// scanner 이용해서 입력을 진행할 경우
		// System.out.print 를 이용해서 제대로 값이 입력됐는지
		// 문제는 없는지 확인 출력을 해주는 습관을 주는 것이 좋음
		String word2 = sc.next();
		
		
		// ***********************
		// - next() / nextInt() / nextDouble() 등을 작성한 이후
		// nextLine() 을 작성해야되는 상황이 오면
		// nextLine() 을 미리 한 번 작성하고 사용하기
		
		sc.nextLine(); // next() 뒤에 남아있는 버퍼값을 Line안에 넣어줌
		//그런데 버퍼값은 우리가 눈으로 보거나 저장을 해야할 이유가 없기 때문에
		//앞에 자료형이나 변수명을 사용해서 버퍼를 넣어 저장해야할 이유가 
		//없어 sc.nextLine() 으로만 사용
		
		//nextLine()을 호출해서 남아 있던 엔터를 제거
		
		
		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
		
		
		// 4. System.out 이용해서 키보드에 작성된 내용출력하기
		System.out.println("정수 1의 값 : " + num1);
		System.out.println("정수 2의 값 : " + num2);
		System.out.println("실수    값 : "+ num3);
		System.out.println("단어들 : "+ word1 +" , "+ word2);
		System.out.println("추가된 문장 :" + str);
		// 5. Scanner close 사용해서 닫아주기
		// Scanner 사용을 다 했다면 공간을 차지하지 않기위해서
		// Scanner를 종료하는 close를 사용해서 닫아주기
		sc.close(); 
		
		
	}

}
