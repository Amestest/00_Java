package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditonPractice {
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요.");
		int num = sc.nextInt();
		String result;
		if(num % 2 ==0 && num > 0){
			result = "짝수입니다.";
		} else if(num <= 0) {
			result = "양수만 입력해주세요.";
		} else {
			result = "홀수입니다.";
		}
		  System.out.println(result);
		 sc.close();
		
	}
	
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		System.out.println("수학점수 : ");
		System.out.println("영어점수 : ");
		int korean = sc.nextInt();
		int math = sc.nextInt();
		int english = sc.nextInt();
		String result;
		if(korean >= 40 && math >= 40 && english >= 40 && (korean + math + english)/3 >=60) {
			result = "국어" + korean;
			result = "수학" + math;
			result = "영어" + english;
			result = "합계" + (korean + math + english);
			result = "평균" + (korean + math + english)/3;
			result = "축하합니다, 합격입니다.";
		}
			else {
				result = "불합격입니다.";
			}
	    System.out.println(result);
	
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력");
		int num = sc.nextInt();
		
		
	}
	
	
	
	
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해 주세요. : ");
		System.out.println("몸무게(kg)를 입력해 주세요. : ");
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		String result;
		if(weight/(height*height)) {
			
			
		}
		
		
	}	
	
	
	
	public static void main(String[] args) {
		//practice1();
		practice2();
		
		
		
		
	}

}
