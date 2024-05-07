package edu.kh.control.condition.practice;

import java.util.Scanner;

//99_practice
public class ControlPre {
	//실습문제 1번 홀수 짝수 나타내기
	public static void practice1() {
		// 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다. 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		// 양수이면서 짝수일 때만 짝수입니다.
		//만약에 숫자가 2로 나누었을 때 나머지가 0이라면 짝수이다.
		
		//만약에 숫자가 양수일경우에만 홀 짝을 나타낼 것이다.
		if(number > 0) { //입력받은 숫자가 양수일 경우에만 홀짝 실행하기
			if(number % 2 == 0) {//숫자가 짝수일 경우 출력하기
				System.out.println("짝수입니다.");
			} else {			//숫자가 홀수일 경우 출력하기
				System.out.println("홀수입니다.");
			}
			
		}else {	//입력받은 숫자가 음수일 경우 출력하기
			System.out.println("음수입니다. 양수만 입력해주세요.");
		}
	}
	
	public static void practice2() {
		//키보드로 국어 영어 수학 점수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		//합계와 평균 계산
		
		int totalScore = korean + english + math; //합계
		double averageScore = totalScore / 3.0;
		//합격 여부 판별
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		if(korean >= 40 && english >= 40 && math >= 40 && averageScore >=60) {
			System.out.println("국어 점수  : " + korean);
			System.out.println("영어 점수  : " + english);
			System.out.println("수학 점수  : " + math);
			System.out.println("합	 계  : " + totalScore);
			System.out.println("평	 균  : " + averageScore);
			
			System.out.println("축하합니다. 합격입니다!!!");
		} else {
			System.out.println("불합격입니다.");
			}
		
		}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		// 키와 몸무게 입력 받기
		System.out.print("키(m) 를 입력하세요.");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력하세요.");
		double weight = sc.nextDouble();
		
		//BMI 계산
		double bmi = weight / (height * height);
		
		//BMI 지수에 따라 결과 출력
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi <23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
	}
	
	public static void practice5() {
		//중간 기말 과제 출석 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		// 출석 비율 계산
		double attendPer =(double) attend / 20 * 100;
		//attend / 20 = 출석한 횟수를 전체 강의 횟수로 나눠서 출석 비율을 계산
		// double 소수점 밑에 있는 수까지 얻어옴
		//실수로 되 ㄴ값을 100을 곱해서 백분율로 변환
		
		
		
		// 평가 비율에 따른 총점 계산
		// 중간 20 기말 30 과제 30 출석 20 = 100점
		// 중간 점수 20
		double midScore = mid * 0.2;
		// 기말 점수 30
		double fiScore = fin * 0.3;
		//과제
		double asScore = assig * 0.3;
		//출석 점수 20
		double attendScore = attendPer * 0.2;
		double totalScore = midScore + fiScore + asScore + attendScore;
		
		
		// 평가에 따른 Pass 또는 Fail 출력
		if(totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("=======결과=======");
		System.out.println("중간고사 점수 (20점 만점) : " + midScore);
		System.out.println("기말고사 점수 (30점 만점) : " + fiScore);
		System.out.println("과   제 점수 (30점 만점) : " + asScore);
		System.out.println("출   석 점수 (20점 만점) : " + attendScore);
		System.out.println("총       점 (100점 만점) : " + midScore);
	}
	
	
	public static void practice3() {
		/*
		 1~12 사이의 수를 입력바당 해당 달의 일수를 출력하세요.
		 2월 윤달은 생각하지 않습니다.
		 OO월은 잘못 입력한 달ㅇ비니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 12 중 하나 입력 : ");
		int month = sc.nextInt();
		
		int daysMonth;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		case 4: case 6: case 9: case 11:
			daysMonth = 30;
			break;
		case 2:
			daysMonth = 28;
			break;
		default:
			System.out.println(month + "월은 존재하지 않는 달입니다.");
			//daysMonth = 0;
			sc.close();
			return;
			
			
		}
		System.out.println(month + "월은 " + daysMonth + "일까지 있습니다.");
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice4();
		//practice5();
		practice3();
		
		
		
		
	}

}
