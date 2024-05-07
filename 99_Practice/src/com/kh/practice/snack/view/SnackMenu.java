package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	//고객이 메뉴를 입력하고 보는 창
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	

	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String flavor = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		System.out.println("저장한 내용을 확인 하시겠습니까?(y/n)");
		String answer = sc.next();
		//만약에 y를 누르면 저장한 내용 출력
		//equalsIgnoreCase 대소문자 상관없이 두 문자열을 비교하는데 사용
		if(answer.equalsIgnoreCase("Y")) {
			//저장한 내용 출력
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			//저장 내용 잘 들어갔는지 확인
			System.out.println(scr.confirmData());
		}
		
		
		
		
	}
}
