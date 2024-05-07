package com.kh.IteratorEx;

import java.util.*;

/*
 ListIterator 
 next는 앞에서부터
 hasNext() : 다음 값이 존재하는지 true false 로 확인
 next() : 다음 값 가져오기
 
 previous는 뒤에서부터 순차적으로 앞으로 출력
 hasPrevious() : 이전 값이 존재하는지 true false로 확인
 Previous() : 이전 값 가져오기
 
 //값을 추가하거나 삭제할 수 있음
  add() : 추가
  remove() : 삭제 가능 
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 색상들 = new ArrayList<>();
		색상들.add("빨강");
		색상들.add("화이트");
		색상들.add("초록");
		
		
		//리스트이터레이터 생성
		ListIterator<String> 반복하기 = 색상들.listIterator();
		
		System.out.println("앞에서부터 출력");
		while(반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상);
			
		}
		
		System.out.println("뒤에서부터 출력");
		while(반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상);
			
		}
		System.out.println("add 를 사용해서 추가하기");
		반복하기.add("파랑");
		//add 해서 값을 추가할 때는 앞에서 추가됨
		System.out.println(색상들);
		
		//previous() 사용해서 현재 위치를 파랑의 위치로 이동
		
		반복하기.previous();
		반복하기.remove();
		
		System.out.println("삭제됐는지 확인 : " + 색상들);
	
		/*
		System.out.println(색상들);
		Exception in thread "main" java.lang.IllegalStateException
		at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
		at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:48)
		
		add 값을 추가하면서 앞으로 이동한 다음에는 리스트의 끝에 위치
		
		더 이상 다음이 없기 때문에 삭제할 수 없음
		
		해결하는 방법
		next()를 호출해서 현재 위치를 변경한 다음에 remove() 호출하거나
		previous()를 호출해서 현재 위치를 변경한 다음에 remove() 호출
		
		*/
	
	}
	
}
