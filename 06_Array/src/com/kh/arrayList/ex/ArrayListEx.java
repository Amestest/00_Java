package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
 ArrayList 
 리스트는 배열과 비슷하지만 크기가 제한이 되어있지 않기 때문에 다름
 원하는 만큼 담을 수 있음
 
  ArrayListEx 로 이름 ArrayList로 사용하지 말 것!
 
  ArrayList<자료형> 변수명 =  new ArrayList<자료형>();
  int 	 -> Integer
  String -> String
  double -> Double
  char   -> 
  
  add 		추가
  get 		반환
  set 		수정
  remove 	삭제
  size 		개수 확인
  isEmpty 	비어있는지 확인
  clear 	모두 삭제
  */
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		// index 자리위치 0
		
		//자리가 비어있기 때문에 true
		System.out.println(num.isEmpty());
		
		//숫자 추가하기
		num.add(10);	//index 0 10 들어감
		
		System.out.println("추가 확인 : " + num.get(0));
	
		System.out.println(num.isEmpty()); //false
		
		//크기 확인 = size  length 사용하지 않음
		System.out.println(num.size());
		//set 수정하기  위치  어떻게 수정할거야?
		//			  key     value
		num.set(       0,     20);
		System.out.println("수정 후 : " + num.get(0));
		
		//삭제
		num.remove(0);
		//삭제했기 대문에 아무것도 없음
		System.out.println(num.isEmpty());
	}
}
