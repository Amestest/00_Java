package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public ArrayEx2() {
		
	}
	public void ex2() {
		// for 문을 활용한 배열 출력하기
		int numbers[] = new int[5];
		//1 부터 4 까지 배ㅕㅇㄹ에 숫자를 넣기
		//index 0부터 시작하기 때문에 i = 0
		//length 길이
		System.out.println("최대길이 : " +numbers.length);
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i +"] = " + i);
		}
		
	}
	
	public void practice1() {
		int numbers[] = new int[10];
		for(int i =0; i < numbers.length; i++){
			numbers[i] = i+1;
			System.out.print(" "+  numbers[i] +" ");
		}
}
	
	public void practice2() {
		int numbers[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length-i;
			System.out.println("numbers[" + i + "] = " + numbers[i]);
			}
	}
	
	public void practice3() {
		
		//양의 정수를 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
				
		int size = sc.nextInt();
		//입력 받은 정수 크기의 배열 생성
		int[] numbers = new int[size]; //size = 5
		// numbers.length = size
		for(int i = 0; i < size; i++) {
			numbers[i] = i + 1;
		System.out.print(numbers[i] + " ");	
		}
	}
	
	public void practice4() {
		String[] fruits = {"사과", "귤", "포도" ,"복숭아", "참외"};
		System.out.println(fruits[1]);
	}
	
	public void practice6() {
		
		//요일 생성
			//length 7
			// index      0    1     2   3   4    5    6
		String[] week = {"월", "화", "수","목","금","토","일"};
		Scanner sc = new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.print("0부터 6까지의 숫자 입력받기 : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 0~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num >=0 && num <= 6) {
			System.out.println(week[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
 
	}
	
	
	public void practice7() {
		
		//길이가 7인 배열을 생성
		int[] num = new int[7]; // index [0 1 2 3 4 5 6]  length:7
				// num의 최종 길이를 알기 위해서 num.length 를 사용
		for(int i = 0; i<num.length; i++) {
			//랜덤으로 숫자 출력하기
			//랜덤으로 숫자를 출력하는 방법
			// 1.Random 객체 사용
			// 2.Math 객체에서 random90 메서드 사용 : 위 Random객체보다 작은 범위로 사용 가능
			
			num[i] = (int)(Math.random() * 45); //45 0~44 -> 1~45
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
	
	
	public void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달가능 없으면 없는 치킨 입니다. 출력
		
		String[] chickenMenu = {"양념치킨", "후라이드치킨","간장치킨"};
		
		//사용자로부터 치킨 이름 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for - each 문을 사용해서 치킨이 있는지 확인하는 작업
		for(String 치킨:chickenMenu) {
			//System.out.println(치킨);
			// 만약에 치킨이 존재한다면 found = true ; break;
			if(치킨.equals(inputChic)) {
				found = true;
				break;
			}
		}
		
		// 만약에 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(inputChic + "배달 가능! 합니다.");
		} else {
			System.out.println(inputChic + "은(는) 없는 메뉴 입니다.");
		}
		// 존재하지 않는다면 ㅇㅇ 치킨은 없는 메뉴입니다. 출력
		
	
	}
	
	
	public void method1() {
		
		//정수 0 1 2     10 20 30 출력하기
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		//문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력
		String str[] = {"월","화","수","목","금","토","일"};
		//for 문을 활용한 출력
		for(int i = 0; i < str.length; i++) {
		System.out.print(str[i] + " ");
		}
		
		
		
		//실수 index 2 까지 만들어주고 출력 실수 자유 
		double dbl[] = new double[3];
		
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.print(dbl[i] + " ");
		}
		
		//문자 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A','B','C'};
		
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice6();
		//ae2.practice7();
		ae2.practice17();
		
	}

}
