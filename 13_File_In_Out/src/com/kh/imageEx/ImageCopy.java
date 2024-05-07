package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
이미지를 복사하기 위해서는 원본 이미지 파일 경로와
옮기고 싶은 이미지 파일 경로를 설정 

File : 파일을 읽고 쓰고 가져오고 사용하는데 쓰이는 객체

FileInputStream : 파일의 데이터를 읽어오는데 사용

	read() : 데이터를 읽어옴

FileOutputStream : 파일의 데이터를 내보내는데 사용

	write() : 데이터를 사용
	
	
*/
public class ImageCopy {
	public static void main(String[] args) {
		//heeling이를 복사
		//힐링이의 사진이 위치하고 있는 장소를 작성
		// 자바코드에서 폴더 구분을 작성할 때는 / 로 작성
		// 모든 파일의 실행은 src로 부터 시작을 함
		//				   폴더 경로를 모두 쓰고 나면 / 를 한 후 파일이름 작성
		String 원본이미지 =  "src/com/kh/imageEx/healing.jpg";//ctrl alt 화살표아래
		String 복사이미지 =  "src/com/kh/imageEx/healing_cute.jpg";
		
		//FileInputStream OutputStream을 사용해서 읽고 쓰고 합시다!
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);
			
			
			//버퍼를 통해 데이터를 읽고쓰기위한 배열을 설정
			byte[] buffer = new byte[1024];
			
			int 길이;
			
			//장바구니로 담은 버퍼를 통해서 원본 파일로부터 데이터를 읽어와 복사할 파일에 사용
			//while문을 사용해서 이미지 0 부터 끝까지 가지고옴
			while((길이 = 파일읽기.read(buffer)) > 0  ) {
				파일쓰기.write(buffer,0,길이);
			}
			
			//파일 읽고 썻다면 종료하기!
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("이미지 복사가 완료되었습니다.");
			
			
		} catch (Exception e) {
			System.out.println("이미지 복사 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
	}
}









