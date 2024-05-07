package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 점수저장");
			System.out.println("2. 점수출력");
			System.out.println("3. 종   료");
			System.out.print("메뉴 선택 : ");
			
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼(엔터와 같은..)지우기
			
			switch(choice) {
			case 1:
				saveScore();
				break;
			case 2:
				//점수보기
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
			}
		}
	}
	public void saveScore() {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 :");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		//국어 영어 수학 점수 총점
		int sum = kor + eng + math;
		
		// 국어 영어 수학 점수 평균
		double avg = sum /3.0;
		
		
		scr.saveScore(name, kor, eng, math,sum,avg);
		
		//readScore
		
	
	}
	
	//점수 읽기
	public void readScroe() throws Exception{
		DataInputStream dis = scr.readScore();
	while(dis.available() > 0) {
	String name = dis.readUTF();
	int kor = dis.readInt();
	int eng = dis.readInt();
	int math = dis.readInt();
	int sum = dis.readInt();
	double avg =dis.readDouble();
	System.out.printf("이름: %s, 국어 : %d, 영어 : %d, 수학 : %d, 합계: %d, 평균: %.2f%n",name,kor,eng,math,sum,avg);
	System.out.println("이름: "+name);
	}
}

	
}
