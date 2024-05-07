package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageResizePre {
	//원본 이미지 pigs.jpg   pigs_cute.jpg   가로 = 400 세로 =200
	public static void main(String[] args) {
		
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 리사이즈이미지 = "src/com/kh/imageEx/pig_cute.jpg";
		
		//새로만들아미지 가로 세로 크기 조정
		
		int 가로 = 400;
		int 세로 = 200;
		
		//원본 이미지 데이터를 버퍼 이미지로 읽어들임
		try {
			
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			//새로운 크기 이미지 생성
			BufferedImage 이미지버퍼 = new BufferedImage(가로,세로,BufferedImage.TYPE_INT_RGB);
			//이미지 크기 조정해서 새로운 이미지에 그릴 것!
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
					
			//모든 준비 완료 이미지 그리기 시작!
			이미지버퍼.createGraphics().drawImage(이미지그리기,0,0, null);
			
			//새로운 이미지를 파일로저장
			ImageIO.write(이미지버퍼,"jpg", new File(리사이즈이미지));
			
			System.out.println("이미지 크기 조정성공!");
					
		}catch(IOException e) {
			System.out.println("이미지 저장에 실패!");
			e.printStackTrace();
		}
		
		
	}
	
	
}
