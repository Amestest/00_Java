package com.kh.interfaceEx;

// 계산기 기본 사용 메서드 implements 로 가져오기
// 계간기 220v 사용해서 사용할것
// 인터페이스 모든~~~~ 인터페이스로 만들어진 파일을 원없이 가지고 올 수 있음
//여러 파일을 가지고 올 때 , 써서 interface 파일명을 작성해주면 됨
public class 어린이용계산기 implements 계산기, 기계{
/* 기계.java 인터페이스에서 가져온 전원켜기와 전원끄기 */	
	
	@Override
	public void 전원켜기() {
		System.out.println("전원을 킵니다.");
	}
	@Override
	public void 전원끄기() {
		System.out.println("전원을 끕니다.");
	}
/* 계산기.java 인터페이스에서 가져온 합 차 곱 몫 나머지 */	
	@Override
	public int 합(int a, int b) {
		return a + b;
	}
	@Override
	public int 차(int a, int b) {
		return a - b;
	}
	@Override
	public int 곱(int a, int b) {
		return a * b;
	}
	@Override
	public double 몫(int a , int b) {
		return a / b;
	}
	@Override
	public double 나머지(int a, int b) {
		return a % b;
	}
}
