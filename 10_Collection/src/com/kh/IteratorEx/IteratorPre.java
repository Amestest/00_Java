package com.kh.IteratorEx;

import java.util.*; //java 폴더 밑에 util폴더 안에 있는 파일 모두가져오기.

/*
파일 위치를 가져올 때
동일한 폴더 위치에서많으 ㄴ파일을 가져올때는
* 사용해서 모두 가져오기를 해준다.
* 전체선택
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {

	public static void main(String[] args) {
		// 100, 10, 20, 30, 50, 70
		//ArrayList<숫자> 숫자들 = new ArrayList<>();
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100,10,20,30,50,70));
		//숫자를 추가하는 방법 1탄
		//숫자들.add(100);
		숫자들.add(100);
		숫자들.add(10);
		숫자들.add(20);
		숫자들.add(30);
		숫자들.add(50);
		숫자들.add(70);
		// 숫자를 추가하는 방법 2탄
		// Arrays.asList()
		
		
		
		//Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		
		//while문 사용해서 hasNext()로 다음 요소가 있는지 확인하고
		//next()로 출력하기
		while(반복하기.hasNext()) {
			int 숫자 = 반복하기.next();
			System.out.println(숫자);
		}
	}

}
