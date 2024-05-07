package com.kh.interfaceEx;

public class 중학생용계산기 implements 계산기,기계{
	
	@Override
	public void 전원켜기() {
		System.out.println("중학생용 계산기 전원을 킵니다.");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생용 계산기 전원을 끕니다.");
	}
	@Override
	public int 합(int c , int d) {
		return c + d;
	}
	@Override
	public int 차(int c , int d) {
		return c - d;
	}
	@Override
	public int 곱(int c , int d) {
		return c * d;
	}
	@Override
	public double 몫(int c , int d) {
		return c / d;
	}
	@Override
	public double 나머지(int c , int d) {
		return c % d;
	}
	

}
