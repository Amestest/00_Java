package com.kh.interfaceEx;
/*
 interface : 클래스 간의 접점을 만드는 용도
 필드에 작성하는 모든 변수가
  public static final로 작성이 됨
  굳이 앞에 public static final 을 붙이지 않아도
  알아서 붙어서 만들어짐
  메서드에 작성하는 모든 메서드앞에
  public abstract 가 알아서 붙어서 만들어짐
  
 Q : 그렇다면 인터페이스는 왜 public static final과 public abstract가 붙는겁니까?
 A : 인터페이스는 자바가에서 다른 클래스에서 구현할 메서드의 명세를 정의하는 영할을 함
  	 인터페이스에 작성되는 필드와 메서드는 다른 클래스에서 구현될 것을 기대하는 것
  	 
  	 내가 주는 값은 강제야 변경할 생각 하지 않기
 */
public interface 기계 {
//필드
	//(public static final) 이 자동으로 생겨져 있음
	//public static final int 볼트=220;와 똑같음
	int 볼트=220;
	
	//인터페이스는 추상메서드만 작성이 가능
	public abstract void 전원켜기();
	// (public abstract)가 자동으로 생성 돼있음
	// public abstract void 전원끄기; 와 똑같음
	void 전원끄기();
}
