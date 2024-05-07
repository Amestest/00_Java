package com.kh.abstractEx;
/*
 abstract class (추상클래스) 
 추상 메서드를 포함하고 잇는 클래스
 미완성 클래스이기 때문에 컴퓨터에 추상클래스로 만든 파일의 자체공간을 만드는 것은 불가능
 
 사용 예제 : 
 [접근제어자] = public protected default private
 [접근제어자] abstract class 파일명{
//필드 & 메서드(필수는 아님)
 	  [접근제어자] abstract 자료형 변수명();
 	  
 }
  */
public abstract class 도형 {  //추상클래스
//추상 : 같은 것을 본 뜬 것
//필드
	private String 색깔;
	
//메서드	
	//Getter
	
	public String get색깔() {
		return 색깔;
	}
	
	//Setter

	public void set색깔(String 색깔) {
		this.색깔 = 색깔;
	}


	//생성자 : 필수
	public 도형(String 색깔) {
		this.색깔 = 색깔;
	}
	
	
	//abstract 나중에 설계도로 완성할 파리에서 필수로 불러줘서 완성해줘야하는 메서드들
	//abstract 메서드는 미완성 메서드이기 때문에 자식클래스에서 미완성된 부모클래스를
	//완성시켜주기 위해서 자식이 부모를 불러올 때 abstract 같은 경우에는
	//자식에서 필수로 불러온 다음 메서드 모양을 완성해야 함
	public abstract double 도형넓이();
	public abstract double 도형둘레();
	
	public void 출력정보() {
		System.out.println("이 도형은 넓이가" + 도형넓이() + "이고 둘레가" + 도형둘레() + "입니다.");
	}
}
