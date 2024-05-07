package com.kh.oop.basic;

public class Animal { //동물
	
	//1. 필드 이름  String name 나이 int age
	
	//2. 초기 생성자
	
	//3. 필수 생성자 String name, int age
	
	//4. 출력 메서드 public void info(){ System.out.println 이름과 나이 출력}
	
	//5. 메인 메서드 public static void main(String[] args){}
	
	//  1) 초기생성자료
	    // Animal dog = new Aniaml();
		// 강아지의 이름 나이
	 	// 강아지 정보 출력
	// 2) 필수생성자료
		//Animal cat = new Animal("고양이",3);
		//고양이 정보 출력

public String name;
public int age;
	public Animal() {
	}
	public Animal(String 이름, int 나이) {
 		this.name = 이름;
 		this.age = 나이;
 	}
 	public void info() {
 		System.out.println("이름 : " + name);
 		System.out.println("나이 : " + age);
	}
 	public static void main(String[] args) {
 		Animal dog = new Animal();
 		dog.name ="강아지";
 		dog.age = 4;
 		
 		dog.info();
 		
 		Animal cat = new Animal("고양이",3);
 		
 		cat.info();
 	}
}	
