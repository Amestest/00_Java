package com.kh.SetEx;

import java.util.HashSet;

/*
 set(집합, 주머니)
  	순서를 유지하지 않음
 	중복 데이터 저장X(같은게 들어오면 덮어쓰기)
 	┌ HashSet(대표)  : 처리 속도가 빠른 set
set ├ LinkedHashSet : 순서를 유지하는 set
 	└ TreeSet       : 자동정렬되는 set
 	
 	HashSet 사용 예제
 		사용 조건 1 : 객체에 equals() 오버로딩 되어 있어야함
 		사용 조건 2 : 객체에 HashCode() 오버로딩 되어 있어야함
 		
 	Set<자료형> 셋 = new HashSet<>();
 	HashSet<자료형> 해시셋 = new HashSet<>();
 	
 */
public class SetEx {

	public static void main(String[] args) {
		//중복을 허용하지 않고 각 값을 저장하는 것을 생성해서
		//데이터 중복 확인 많이 사용
		HashSet<String> set = new HashSet<>();
		//데이터를 추가 			add
		set.add("로맨스");
		set.add("공포");
		set.add("액션");
		set.add("스릴러");
		System.out.println(set);
		/*
		  자리 데이터 확인 			get
		  System.out.println(set.get(1));
		  set 자리가 랜덤이고 특정하게 자리번호로 배정된 자리가 없음
		  */
		
		//데이터 제거 				remove
		set.remove("로맨스");
		System.out.println(set);
		//데이터 크기 확인 			size
		System.out.println(set.size());
		//데이터 모두 제거 			clear
		set.clear();
		//특정 데이터가 존재하는지 확인	contains
		System.out.println(set.contains("스릴러"));
		//데이터 수정 또한 지정 자리값이 ㅇ벗어서 불가	 set	
		
	
	}
}
