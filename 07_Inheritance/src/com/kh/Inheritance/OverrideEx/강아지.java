package com.kh.Inheritance.OverrideEx;

// 강아지가 동물에서 소리를 상속
public class 강아지 extends 동물{

	
	/*
  	super(이름)
  	동물 클래스 동물의 생성자를 호출하는 역할
  	super() : 자바에서 자식 클래스의 생성자는 반드시 상위 클래스의 생성자를 호출
  				호출할 때 super() 호출하며, 상위 클래스의 생성자를 호출 할 수 있음
  
  
  */
	public 강아지(String 이름) {
		super(이름);
	}

	/*
	 @Override : 부모 클래스에서 부모가 가진 메서드를 다시 작성하거나 수정해서 정의내릴 때 사용
	  			필수로 작성하는 것은 아니지만, 작성을 해줌으로 인해서
	  			부모 클래스에서 가지고 와서 수정했다는 개발자적 표시를 해주는것
	  
	 */
	
	//강아지소리
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 멍멍짖습니다.");
	}

}
