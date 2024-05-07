package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	//maint
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		// offer 80 60 30 20
		queue.offer(80);
		queue.offer(60);
		queue.offer(30);
		queue.offer(20);
		// poll 데이터 확인 및 제거
		int 맨앞데이터 = queue.poll();
		System.out.println(맨앞데이터);
		// peek 맨 앞 데이터 확인
		int 데이터확인  = queue.peek();
		System.out.println(데이터확인);
		//isEmpty 비어있는지 확인
		boolean 빈값확인 = queue.isEmpty();
		System.out.println(빈값확인);
	
	}
	
	
}
