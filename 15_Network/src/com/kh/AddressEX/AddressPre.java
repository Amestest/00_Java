package com.kh.AddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	//www.google.com 호스트명과 IP주소 가져오기
	
	public static void main(String[] args) {
		
		
		try {
			
			InetAddress 구글주소 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + 구글주소.getHostName());
			System.out.println("IP 주소 : " + 구글주소.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//나의 컴퓨터 이름과 자리번호 확인하기
		//getlocalhost
		InetAddress 내집주소;
		try {
			
			내집주소 = InetAddress.getLocalHost();
			System.out.println("내컴퓨터이름과 자리번호 확인하기 : "  + 내집주소);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// www.facebook.com. 페이스북 호스트이름 호스트주소
			InetAddress 페이스북;
			try {
				페이스북 = InetAddress.getByName("www.facebook.com");
				System.out.println("호스트이름 : " + 페이스북.getHostName());
				System.out.println("호스트주소 : " + 페이스북.getHostAddress());
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			}
			
		// www.instagram.com 인스타그램 호스트이름 호스트주소 검색
			try {
				
				InetAddress instagram = InetAddress.getByName("www.instagram.com");
				System.out.println("호스트이름 : " + instagram.getHostName());
				System.out.println("호스트주소 : " + instagram.getHostAddress());
				
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			
			}
			
		
		
	}
	
	
}
