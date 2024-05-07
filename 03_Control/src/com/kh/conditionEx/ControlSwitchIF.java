package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIF {

	public static void takeAtaxi() {
		//입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		// if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성해줄 것
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			// answer로 받은 대답에 따라 응답을 처리하기
			 switch (answer) {
			 case "예" :
				 System.out.println("택시를 탔습니다.");
				 break;
			 case "아니오" :
				 System.out.println("택시를 타지 않습니다.");
				 break;
			 default : 
				System.out.println("잘못된 입력입니다.");	 
		}
		
	}else {
		System.out.println("3000원 이하이므로 잔액이 부족합니다.");
	}
}
	
	/*
	 * 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 * 90 이상일 경우 A학점
	 * 80 이상일 경우 B학점
	 * 70 이상일 경우 C학점
	 * 60 이상일 경우 D학점
	 * 60점 미만일 경우 F학점
	 * -> F 학점일 때 재수강 하시겠습니까? (Yes/No)
	 *  만약에 Yes No 이외의 값이 나올 수 있기 때문에
	 *  Case Yes : case yes :
	 * */
	public static void whyScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else if(score >= 60) {
			System.out.println("D학점");
		} else  {
			System.out.println("F학점");
			System.out.println("재수강하시겠습니까? (yes/no)");
		} 
		String reScore = sc.next();
		switch(reScore) {
		case "Yes" : case "yes" : case "YES" :
			System.out.println("재수강 신청이 완료되었습니다.");
			break;
		case "No" : case "no" : case "NO" :
			System.out.println("재수강 신청을 하지 않았습니다.");
			break;
		default :
				System.out.println("잘못된 입력입니다.");
		}
	    sc.close();
	}
	
	public static void whatDay() {
		//오늘은 어떤 요일인지 확인한 후에 요일에 따른 출력을 진행할 것
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요일을 입력해주세요 : ");
		System.out.println("(월 / 화 / 수 / 목 / 금 / 토 / 일)");
		String day = sc.next();
		
		String result;
		switch(day) {
		case "월" : case "수" : case "금" :
			result = "헬스";
			break;
		case "화" : case "목" :
			result ="공부";
			break;
		case "토" : case "일" :
			System.out.println("주말이네요.");
			System.out.println("집에서 쉴 예정인가요? (예 / 아니오) : ");
			String answer = sc.next();
			if (answer.equals("예")) {
				result = "집에서 쉴 예정입니다.";
			} else {
				System.out.println("어떤 활동을 할 계왹인가요 ?");
				System.out.println("1.등산 / 2.독서 / 3.수영) :");
				int activity = sc.nextInt();
				switch (activity) {
				case 1:
					result ="등산";
					break;
				case 2:
					result ="독서";
					break;
				case 3:
					result ="수영";
					break;
				default:
					System.out.println("잘못된 입력");
						
					return;
				}
			}
			break;
		default:
			return;
		}
		System.out.println(day + "요일에" + result + "할 예정입니다." );
	
	}
	
	
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
		
	}

}
