package com.kh.imageEx;

import java.io.*;


public class ImageCopyPre {

	public static void main(String[] args) {
		//원본이미지 hogam 복사이미지 hogam_cute
		String 원본이미지 ="src/com/kh/imageEx/hogam.jpg";
		String 복사이미지 ="src/com/kh/imageEx/hogam_cute.jpg";
		
		
		//원본이미지 파일 가져오기!
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);
			//버퍼를 통해 데이터를 읽고 쓰기 위한 배열 설정
			
			byte[] 버퍼 = new byte[1024];
			
			int 파일길이;
			//버퍼를 통해 원본 이미지 데이터를 가져와 복사할 파일에 사용
			while((파일길이 = 파일읽기.read(버퍼)) > 0) {
				파일쓰기.write(버퍼,0,파일길이);
				
			}
			
			//파일 스트림 닫아주기
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("이미지 복사 완료");
		} catch (Exception e) {
			System.out.println("이미지 복사중 오류발생");
			e.printStackTrace();
		}
		
		
		
		
	}

}
