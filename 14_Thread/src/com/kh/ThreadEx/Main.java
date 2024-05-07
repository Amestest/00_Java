package com.kh.ThreadEx;

public class Main {
	public static void main(String[] args) {
		ThreadEx  스레드 = new ThreadEx();
		스레드.start();
		
		System.out.println("1차 스레드 끝 EX2 스레드 시작1");
		
		//for 총 3개의 스레드를 생성해서 실행
		
		for(int i = 0; i < 3; i++) {
		//ThreadEx2의 부모이기 때문에 Thread 왼쪽에서 작성하는 것이 가능	
			Thread t = new ThreadEx2(i);
			
			if(i == 2) {
				t.setPriority(Thread.MIN_PRIORITY); // MIN = 1
			} else if (i ==1){
				t.setPriority(Thread.MAX_PRIORITY); // MAX = 10
			} else {
				t.setPriority(Thread.NORM_PRIORITY);
			}
			
			
			
			
			t.start();
		}
		System.out.println("메인 끝~~~!");
		
	}
}
