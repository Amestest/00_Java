package com.kh.oop.method;

public class Animal {
//필드
	public String name;
	public int age;
	
	
//메서드
	//생성자
	//기본
	public Animal() {
		
	}
	// 필수 name age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	//return
	public String getName() {
		return name;
	}
	
	//return 으로 나이 받기
	public int getAge(){
		return age;		
	}
	
	// void 로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
	}
	
	
	//메인메서드
	
	public static void main(String[] args) {
		Animal dog1 = new Animal("강아지",1);
		Animal cat1 = new Animal("고양이",1);
		
		dog1.info();
		cat1.info();
		
	}

}
