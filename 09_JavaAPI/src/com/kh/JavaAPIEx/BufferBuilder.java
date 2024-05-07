package com.kh.JavaAPIEx;
/*
 String : 변할 수 없음;
 문자나 문자열을 사용할 때 사용 후 변수명에 다른 값을 넣어주는 것이지
 수정하거나 삭제하는 것은 힘듦
 
 메모리 크기가 변할 수 있는 환경 수정하고 삭제를 해도 문제가 없음
 StringBuffer : 여러 쓰레드에서 동시에 사용되어도 안전하게 작업을 처리 (동기화)
 StringBuilder : 하나의 쓰레드에서 사용하는 것이 효율 (비동기, 추천)
  
  Thread : 컴퓨터 내에서 실행되는 독립적인 실행 흐름
  동기 : 요청과 결과가 동시에 일어난 것을 이야기함
  비동기 : 요청과 결과가 한 자리에서 동시에 일어나지 않음
  
  */
public class BufferBuilder {
	//무언가 행동을 진행할 때 메서드
	
	//바로 실행하고 출력하고싶어 -> main
	public static void main(String[] args) {
		//1. StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(" World");
		System.out.println(buffer.toString());	
	
		//2. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder.toString());
	
	}
	
	
}
