package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	//main
	public static void main(String[] args) {
		
								//Set.of()
		TreeSet<String> fr = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박" ,"딸기"));
		
		
		fr.add("키위");
		
		// 과일들 String "키위 복숭아 참외 수박 딸기 "
		System.out.println("과일들 모두 보기 :" + fr);
		//복숭아 제거
		fr.remove("복숭아");
		System.out.println("과일들 모두 보기 : " + fr);
		//수박이 포함 되어있는지 확인
		System.out.println(fr.contains("수박"));
		//과일들이 비어있는지 확인
		System.out.println(fr.isEmpty());
		//과일들 갯수
		System.out.println(fr.size());
		//가장 작은 값
		System.out.println("가장 작은값 : " + fr.first());
		//가장 큰 값
		System.out.println("가장 큰 값 : " + fr.last());
		//모든 값 제거
		fr.clear();
		//모든 값 제거 되었는지 확인
		System.out.println("과일들 모두 보기: " + fr);
			
	}
	
	
}
