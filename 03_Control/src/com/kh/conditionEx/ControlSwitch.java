package com.kh.conditionEx;

public class ControlSwitch {
	/*
	 switch / case
	 	if문과 비슷하지만 형식이 일정하게 잇는 조건 판단문
	
	  사용방법
	  switch(입력변수){
	  	case 입력값 : 
	  		실행할 문장
	  		break; //case를 빠져나가기 위한 제어장치

	  
	  	case 입력값2 :
	  		 실행할 문장
	  		 break; // 만약에 break가 없다면 다음 case를 실행할 것
	  		 
	  	...
	  	
	  	default : // 입력변수와 일치하는 값이 없을 때 실행되는 옵션
	  		      // 선택 사항이며 필요에 따라 생략할 수 있음
	  		      // else 와 비슷한 행위를 진행함
	  		실행할 문장
	  		break;
	  }
	  
	  사용 방법 2
	  	case의 경우 다른 번호가 동일한 결과를 갖길 원한다면
	  	case를 이어서 작성할 수 있음
	  		case 1 : case 2 : case 3 :
	  			System.out.println("케이스 1 2 3 에 대한 결과");
	  		default : 
	  			system.out.println("1 2 3 이외의 결과");
	  			
	  		break; 원하는 case를 만나면 case에 맞는 조건을 실행한 후
	  			프로그램을 종료하길 원할 때 사용
	  			case에 관련된 결과를 실행하기 전에 break를 호출하면
	  			에러가 발생함
	  			
	  		break와 return	
	  		break의 경우 switch나 for문 while문에서 사용
	  				해당하는 case이외를 종료함
	  		
	  		return 어디서든지 사용 가능		
	  			값을 반환할 수 있고, 메서드나 함수의 실행을 중단하고 호출한 곳으로 값을 전달
	  			메서드나 함수 내에서 return 문이 샐행되면 그 이후에 코드는 실행되지 않음
	 */
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		
		switch (day) {
			//조건에 해당하는 case를 작성
		case 1:
			dayString = "일요일";
		case 2:
			dayString = "월요일";
		case 3:
			dayString = "화요일";
		case 4:
			dayString = "수요일";
		default : 
			dayString = "잘못된 입력";
		}
		
		System.out.println("입력한 숫자는 " + dayString + "입니다.");
		
	}

}
