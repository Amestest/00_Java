package com.kh.test.main.oop;

//동물 하나만 상속 implements Animal 동물 이외에 여러 파일을 , 사용해서 작성할 수 잇음
//파일의 종류는 interface 이어야만함
//동물에서 소리를 만드는 makeSound 가 재사용되고 있지 않기 때문에
//강아지에서는 빨간불이 들어옴
public class Dog implements Animal , AnimalEat{
	//Animal에 있는 인터페이스 메서드 구현
	@Override //주석같은 의미로 생략을 해도 괜찮지만 개발자 간의 약소긍로 작성하는 것이기 때문에
			//재사용은 어지간해서 작성해주는 것이 좋음
	public void makeSound() {
		System.out.println("멍멍!");
	}
	//@Override 사용해서 eat 냠냠 작성하기


}
