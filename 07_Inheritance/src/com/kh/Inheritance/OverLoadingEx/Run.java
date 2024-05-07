package com.kh.Inheritance.OverLoadingEx;

public class Run {
	//main 메서드 : main은 오버로딩 X
	public static void main(String[] args) {
		//사람 1 : 홍길동
		Person 사람1 = new Person();
		사람1.setName("홍길동");
		//사람 2 : 박영희
		Person 사람2 = new Person("박영희");
		
		//사람 3 : 김철수
		Person 사람3 = new Person("김철수", 17);
		
		사람1.displayInfo();
		사람2.displayInfo();
		사람3.displayInfo();
		
	}
}
