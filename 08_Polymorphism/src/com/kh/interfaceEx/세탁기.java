package com.kh.interfaceEx;

public class 세탁기 implements 기계{

	@Override
	public void 전원켜기() {
		System.out.println("세탁기의 전원이 켜졌습니다.");
	}
	
	
	@Override
	public void 전원끄기() {
		System.out.println("세탁기의 전원이 꺼졌습니다.");
		
	}
}
