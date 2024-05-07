package com.kh.arrays.ex;
/*
 Arrays
  	배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와줌
  	정렬, 복사, 비교
 메소드
 sort() : 배열을 정렬
 copyOf() : 배열을 복사해서 똑같은 배열을 만들어줌
 equals() : 두 배열이 똑같은지 비교
 fill() : 배열을 모두 지정된 값으로 채우기
 toString() :배열을 문자열로 변경해서 보여줌
  
  asList() : 배열을 리스트로 변환해서 추가 배열을 수정하지 않고 배열의 내용을 감싸서 보여줌
 
 String[] 배열 = {"사과", "바나나"};
 
 //List 계열에 추가할 때
  ArrayList<String> 리스트 = Arrays.asList(배열);
  ArrayList<String> 리스트 = Arrays.asList("사과", "바나나");
  */

import java.util.Arrays;

public class ArraysEx {
	
	//메인 메서드
	public static void main(String[] args) {
		//숫자 배열을 생성
		//    index  0 1 2 3 4     length : 5 
		int[] num = {5,8,2,4,3};


		//정렬하기
		Arrays.sort(num);
		
		//배열이 위치한 주소를 출력
		System.out.println(num);
		//배열을 오름차순으로 정렬한것을 문자열로 변경해서 출력
		System.out.println(Arrays.toString(num));
	
		
		//배열을 복사
		//배열이 들어갈 변수명 먼저생성
		//int 배열이면 int 배열을 생성
			//       복사 붙여넣기     복사될 변수   어디까지 복사할 것인가
		int[] abc = Arrays.copyOf(     num,      num.length);
		//num 변수가 abc로 잘 복사가 됐는지 확인하기
		System.out.println("num이 복사된 abc : " + Arrays.toString(abc));
	
		//두 배열이 똑같이 생겼는지 확인하기
			//num과 abc가 똑같이 생겼는지 확인만 하는것 
		boolean same = Arrays.equals(num, abc); //순서 상관없음
		System.out.println("num과 abc는 똑같나요 : " + same);
		
		
		// 0 ~ 4의자리 까지 모두 똑같은 값으로 지정해서 출력
		int[] 똑같은숫자들 = new int[5];
		Arrays.fill(똑같은숫자들, 3);
		
		System.out.println("숫자 3으로 모두 채우기 : " + Arrays.toString(똑같은숫자들));
	}
	
}
