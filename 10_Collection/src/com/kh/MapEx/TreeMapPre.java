package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
		 tmp 
		 String,String 으로
		 "apple","사과"
		 banana 바나나
		 orange 오렌지
		 grape 포도
		 watermelon 수박
		  
		  [] for 문을 활용해서 추가
		  
		  전체출력
		  get 사용해서 banana에 해당하는 값 가져오기
		  size 확인
		  isEmpty 비어있는지 확인
		  containsKey 키가 존재하는지 확인 grape
		  containsValue 값이 존재하는지 확인 포도
		  keySet()모든 키 출력
		  values 모든 값 출력
		  firstKey()첫번째 키 출력
		  lastKey() 마지막 키 출력
		  clear
		 */
		TreeMap<String,String> tmp = new TreeMap<>();
		
		String[] keys = {"apple","banana","orange","grape","watermelon"};
		String[] values = {"사과","바나나","오렌지","포도","수박"};
		
		for(int i = 0; i < keys.length; i++) {
			tmp.put(keys[i], values[i]);
		}
		System.out.println(tmp);
		
		System.out.println(tmp.get("banana"));
		
		System.out.println(tmp.size());
		
		System.out.println(tmp.isEmpty());
		
		System.out.println(tmp.containsKey("grape"));
		
		System.out.println(tmp.containsValue("포도"));
		
		System.out.println(tmp.keySet());
		
		System.out.println(tmp.values());
		
		System.out.println(tmp.firstKey());
		
		System.out.println(tmp.lastKey());
		
		tmp.clear();
		System.out.println(tmp);
		
		
	}
}
