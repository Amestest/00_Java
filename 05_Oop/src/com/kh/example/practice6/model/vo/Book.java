package com.kh.example.practice6.model.vo;

public class Book {
	//필드
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	//생성자
	// 1. 기본생성자
	public Book() {
		
	}
	
	// 2. 필수생성자 필수로 매개변수를 넣어줘야 하는 생성자
	// title publisher author
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//void 메서드
	public void inform() {
		System.out.println("책이름 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("책가격 : " + price);
		System.out.println("할인율 : " + discountRate);
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		 System.out.println("보물섬책방에 오신 것을 환영합니다.");
		 
		 //book 1 책정보 입력 후 출력
		 Book book1 = new Book();
		 book1.title = "그것이 알고 싶다";
		 book1.author = "박진아";
		 book1.publisher = "sbs";
		 book1.inform();
		 //book 2 책정보 필수생성자에서 String title, String publisher, String author 출력
		 Book book2 = new Book("5월 32일", "kh T반","김경난");
		 
		 book2.inform(); 
		 //book 3 모두 입력되어잇는 필수생성자 이용해서 출력
		 Book book3 = new Book("Do it! 자바 프로그래밍 입문","이지스퍼블리싱","박은종",16500,0.34);
		 book3.inform();
	}

}
