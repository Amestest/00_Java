package com.kh.oop.method.oop;

public class DrinkRun {
	//메인메서드
	public static void main(String[] args) {
		//음료 제조하기
		DrinkMaker dm1 = new DrinkMaker("허브티",1,5);
		//음료 가게작성
		DrinkStore ds1 = new DrinkStore(dm1,"경기","멕아커피",false);
		//주문 및 제조
		ds1.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("아메리카노",3,1);
		
		DrinkStore ds2 = new DrinkStore(dm2,"서울 서초구","빠나쁘레소",true);
				
		ds2.orderDrink();
	}

}
