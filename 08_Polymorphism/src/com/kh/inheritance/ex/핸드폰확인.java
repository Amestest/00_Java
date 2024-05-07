package com.kh.inheritance.ex;

public class 핸드폰확인 {

	public static void main(String[] args) {
		
		//스마트폰 중에서 아이폰을 확인하자
		
		스마트폰 p1 = new 아이폰();
		//아이폰 p1 = new 아이폰();
		
		
		p1.set화면("레티나 디스플레이");
		
		System.out.println("p1.화면은 " + p1.get화면());
		//스마트폰 그릇에 아이폰을 가지고오면
		//부모의 기능을 가져올 수 있지만 자식의 기능은 가져올 수 없음
		p1.set통신사("KH");
		System.out.println("p1.통신사는 " + p1.get통신사());
		p1.set성능("최신");
		System.out.println("p1.성능은 " + p1.get성능());
		
		//부모의 기능을 상속받은 자식을 호출하면
		//모두 사용 가능
		아이폰 p2 = new 아이폰();
		p2.set화면("사과");
		p2.set통신사("KH");
		p2.set성능("초고속");
		p2.setIOS(1);
		System.out.println(p2.toString());
		
		
		System.out.println("===============");
		
		스마트폰 g1 = new 갤럭시();
		g1.set화면("아몰레드");
		g1.set통신사("KH");
		g1.set성능("최신초고속");
		
		//무조건 갤럭시에 있는 g1.안드로이드를 가지고 와서 써야겠어요.
		//다운캐스팅 : 강제로 형변환을 진행해준 후 불러올 수 있도록 해줌
		
		갤럭시 g2 = (갤럭시) g1;
		g2.set안드로이드(4); //g1 을 g2에다가 담아서 사용할 수 있도록 해줌
		
		System.out.println(g2.toString());
		
		
	}

}