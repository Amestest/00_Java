package com.kh.oop.constructor;

public class Cafe { // 맨 위는 () 들어가지 않음
	// 필드 선언
		//카페 이름 지역 테이블수
	public String name;
	public String location;
	public int tableNum;
	
	
	// 기본 생성자와 필수 생성자 만들기
	public Cafe() {
		
	}
	
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
		
	}
	// void 메서드 만들기
	public void cafeInfo() {
		System.out.println("카페 이름 : " + name);
		System.out.println("카페 위치 : " + location);
		System.out.println("테이블 수 : " + tableNum);
		System.out.println("---------------");
		//카페이름 지역 테이블수 출력하기
		// system.out.println("---------------")
	}
	
	public static void main(String[] args) {
		System.out.println("안녕하세요. kh민족입니다.");
		System.out.println("=== 카페 조회하기 ==");
		
		//Cafe 객체를 사용해서
		//1. 기본생성자로 cafe1만들기
		// 이름 테이블 작성하고 출력하기
		Cafe cafe1 = new Cafe();
		cafe1.name = "스타벅스";
		cafe1.tableNum = 50;
		cafe1.cafeInfo();
		
		//2. 기본생성자로 cafe2 만들기
		// 지역 테이블 작성하고 출력하기
		Cafe cafe2 = new Cafe();
		cafe2.location = "역삼역";
		cafe2.tableNum = 30;
		cafe2.cafeInfo();
		//3. 필수 생성자 cafe3 만들기
		// 필수로 생성한 내용 출력하기
		
		Cafe cafe3 = new Cafe();
		cafe3.name = "스타벅스";
		cafe3.location = "강남역";
		cafe3.tableNum = 40;
		cafe3.cafeInfo();
		
		
		
	}

}
