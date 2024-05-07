package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEX2 {
	/*
	 if - else if - else
	 사용방법
	 if(조건1){
	 	조건1이 참일 경우 실행할 코드 작성
	 } else if(조건2){
	 	조건1이 거짓이고
	 	조건2가 참일 경우 실행할 코드 작성
	 } else {
	 
	 	조건 1과 조건2가 모두 거짓일 경우 실행할 코드 작성
	 }
	 
	 
	 */
	public static void main(String[] args) {
		//method2();
		method3();
		//method4();
	}
	
	/*
	 나이를 입력받아
	 13세 이하면 "어린이"
	 13세 초과 18세 이하 "청소년"
	 18세 초과 "성인"
	 */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("안녕하세요. kh티켓나라입니다.");
		System.out.print("나이를 입력해주세요. : ");
		int age = sc.nextInt();
		String result;
		if(age  <= 13) {
			result = "어린이";
		} else if (age<= 18) {
			result ="청소년";
		} else {
			result ="성인";
		} System.out.println(result + "입니다.");
		sc.close();
	}
	/*
	 달을 입력받아 해당하는 계절 출력하기
	 봄 : 3,4,5
	 여름 : 6,7,8
	 가을 : 9,10,11
	 겨울 : 12,1,2 
	 */
	
	public static void method1() {
		
		// 만약에 돈이 2000원 이상 있을 경우 택시를 탄다
		// 만약에 돈이 1500~1900원 이하 있을 경우 대중교통을 이용한다.
		// 만약에 돈이 없을 경우 걸어간다.
		
		
		int money = 1800; //내가 현재 가지고 있는 돈
		
		if(money >= 2000) {
			System.out.print("택시를 탄다.");
		} else if(money >= 1500 && money <=1900){
			System.out.println("대중교통을 이용한다.");
		} else {
			System.out.println("걸어간다.");
		}
			
			
	}

	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 알고싶은 월을 입력하세요. : ");
		int month = sc.nextInt();
		String result;
		if (month ==1 || month ==2 || month == 12) {
			result = "겨울";
		} else if(month >= 3 && month <=5) {
			result = "봄";
		} else if(month >= 6 && month <= 8) {
			result = "여름";
		} else if(month >= 9 && month <= 11){
			result = "가을";
		} else {
			result = "해당하는 계절이 없습니다.";
		} 
		  System.out.println(result);
		sc.close();
	}
	 public static void method4() {
		 //13세 이하 어린이 14 ~1 8 청소년 19 성인
		 
		 int age = 22;
		 // 변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		 String result;
		 if(age <= 13) {
			 result = "어린이";
		 } else if (age >= 14 && age <=18) {
			 result = "청소년";
		 } else {
			 result = "성인";
		 }
		 System.out.println(result + "입니다.");
	 }
	 
	
	
}
