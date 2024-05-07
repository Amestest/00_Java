package com.kh.AddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 외부 아이피 주소를 알아봄
 
 내 집 주소 알아보기
 InetAddress.getLocalHost() : 현재 내 컴퓨터에 지정된 IP 주소를 가져오는 메서드
 192.168.0.1 
  
  내 IP 주소 : 192.168.0.28
  기본으로 처음에 컴퓨터가 동일한 선에서 1대일 때는 192.168.0.1 마지막이 1로 시작하는 숫자를 받지만
  
  여러사람이 함께 동일한 장소, 동일한 컴퓨터선, 동일한 네트워크를 나눠서 받게 될 경우에는 1부터 번호가 부여받게 됨
  
     강남에 35호
  192.168.0.35 의 경우 내 집에 있느 ㄴ호수를 가리켜서 사용
  
  숫자로 우리집 = 127.0.0.1= localhost = 192.168.0.35
  */
public class AddressEx2 {
	public static void main(String[] args) {
		try {
			
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + 로컬호스트.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
