package com.kh.oop.method.ex;

//커피 만들기
public class CoffeeMaker {
	//필드
	private String coffeeType; //커피 종류
	private int sugar; //설탕양
	private boolean milk; //우유 유무
	
	//setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//getter - boolean 같은 경우 get이 아니라 is 로 표기
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
//메서드	
	//생성자 : 기본
	public CoffeeMaker() {
		
		
	}
	//생성자 : 필수
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	//void
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + sugar + " g");
		//만약 우유가 추가 됐따면
		if(milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		
	}
	//main - 최종으로 실행하거나 출려갛 코드 작성
	/*
	public static void main(String[] args) {
		//기본 생성자로 객체 사용
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);	
		coffee1.setMilk(false);
		
		coffee1.makeCoffee();
		System.out.println("---------------");
		
		//필수 생성자 사용해서 커피 객체 생성
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인아메리카노",2,true);
		coffee2.makeCoffee();
		
	}
	*/


}
	
