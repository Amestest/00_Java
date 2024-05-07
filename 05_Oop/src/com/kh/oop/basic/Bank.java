package com.kh.oop.basic;

public class Bank {
	// 이름 게좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agree;
	//boolean 기본값 fasle
	
	// 생성자 메서드
	//1. 필수가 아닌 생성자 = 클래스명 같아야함
	public Bank() {
		
	}
	//2. 필수인 생성자 이름 계좌번호 잔액 패스워드
	public Bank(String 이름, String 계좌번호, int 잔액, String 비밀번호) {
		this.name = 이름;
		this.accountNumber =계좌번호;
		this.balance = 잔액;
		this.password = 비밀번호;
		
	}
		
		
	
	//3. 출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
		
	}
	
  // 4. 최종 메인 출력 메서드
	public static void main(String[] args) {
		// 1. 조 씨 은행 통장 ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		
		//2. 던 씨 은행 통장 수신동의 실수로 안함
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		// 수신동의를 해야하는데 수신도으이를 안하고 바쁘다고 먼저감
	
		customer2.info();
		
		//3. 필수 생성자를 활용해서 마이클씨의 은행 통장
		// 이름 계좌번호 잔액 비밀번호 를 입력하고
		// 마케팅 수신동의를 true 변경해서 출력하기
		Bank customer3 = new Bank("마이클","456-678-234",4567,"1234");
		
		customer3.agree = true;
		
		customer3.info();
	
	}
	
}







