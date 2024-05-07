package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("월드콘");
		ice1.setSugar(3);
		ice1.setMilk(false);
		ice1.makeIceCream();
		System.out.println("------------");
		IceCream ice2 = new IceCream("바닐라",1,true);
		ice2.makeIceCream();
		
		
	}
}
