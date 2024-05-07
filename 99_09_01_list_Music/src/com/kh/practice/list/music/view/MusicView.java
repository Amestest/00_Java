package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	//스캐너로 원하는 음악 관리 번호를 입력하기
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu(){
		while(true) {
			System.out.println("=== 음악 관리 프로그램 ===");
			System.out.println("1. 음악 추가");
			System.out.println("2. 첫 번째 위치에 음악 추가");
			System.out.println("3. 전체 목록 출력");
			System.out.println("4. 음악 검색");
			System.out.println("5. 음악 삭제");
			System.out.println("6. 음악 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수 내림차순 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			//번호 입력할수있는 번호 입력 공간 만들어주기
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
			
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				//음악수정
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}

	//음악 추가
	public void addList() {
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수명 입력 : ");
		String singer = sc.nextLine();
		
		//곡과 가수 저장하기
		mc.addList(title, singer);
	}
	//첫 번째 위치에 바로 음악 추가하기
	public void addAtZero() {
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수명 입력 : ");
		String singer = sc.nextLine();
		
		//음악을 추가하는데 맨 앞에 추가
		mc.addAtZero(title,singer);
	}
	//모든음악 출력
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	//음악검색
	public void searchMusic() {
		System.out.println("검색할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	
	//음악삭제
	public void removeMusic() {
		System.out.print("삭제할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println(mc.removeMusic(title));
		
	}
	//음악에서 가수만 수정
	public void setMusic() {
		System.out.print("수정할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("새로운 가수명 입력 : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}

	
	//오름차순 정렬
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("곡명을 오름차순으로 정렬하였습니다.");
	}
	//내림차순 정렬
	public void descSinger() {
		mc.sescSinger();
		System.out.println("가수명을 내림차순으로 정렬하였씁니다.");
	}
	
}

