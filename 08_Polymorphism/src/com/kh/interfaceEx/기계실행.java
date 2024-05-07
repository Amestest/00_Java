package com.kh.interfaceEx;

public class 기계실행 {

	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
	
		세탁기 돌돌이 = new 세탁기();
		돌돌이.전원켜기();
		돌돌이.전원끄기();
	
		//어린이용 기계 실행
		어린이용계산기 c1 = new 어린이용계산기();
		c1.전원켜기();
		c1.전원끄기();
		
		//어린이용 계산기 기능 테스트
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + c1.합(a,b));
		System.out.println(a + " - " + b + " = " + c1.차(a,b));
		System.out.println(a + " * " + b + " = " + c1.곱(a,b));
		System.out.println(a + " / " + b + " = " + c1.몫(a,b));
		System.out.println(a + " % " + b + " = " + c1.나머지(a,b));
	
		//중학생용 게산기 실행
		중학생용계산기 c2 = new 중학생용계산기();
		c2.전원켜기();
		
		
		int c = 14;
		int d = 3;
		
		System.out.println(c + " + " + d + " = " + c2.합(c,d));
		System.out.println(c + " - " + d + " = " + c2.차(c,d));
		System.out.println(c + " * " + d + " = " + c2.곱(c,d));
		System.out.println(c + " / " + d + " = " + c2.몫(c,d));
		System.out.println(c + " % " + d + " = " + c2.나머지(c,d));
	
		c2.전원끄기();
	}

}
