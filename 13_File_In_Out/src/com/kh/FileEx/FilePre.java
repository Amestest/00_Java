package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	
	public FilePre() {
		
	}
	public void 메서드1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else { //존재하지 않는 다면 
			//만약에 파일 만들기 성공!
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일만들기 실패했습니다.");
				e.printStackTrace();
			}
		}
	}
	
	public void 메서드2() {
		
		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		
		//바탕화면 경로를 설정하는 방법				c:/User/user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		System.out.println(바탕화면경로);
		
		
		File 폴더 = new File(폴더경로);
		System.out.println("존재합니까? : " + 폴더.exists());
		
		if(폴더.exists()) {
			System.out.println("폴더가 존재합니다.");
		} else {
			폴더.mkdir();
			System.out.println("폴더 만들기 성공");
			System.out.println(폴더.getName());
			System.out.println(폴더.getPath());
		}
	
		File 텍스트 = new File(폴더 +"/텍스트파일.txt");
		
		if(텍스트.exists()) {
			System.out.println("파일이 존재");
		}else {
			try {
				텍스트.createNewFile();
				System.out.println(텍스트.getName() + "파일 생성");
			} catch (IOException e) {
				System.out.println("파일만들기 실패.");
				e.printStackTrace();
			}
		}
	
	
	}

	public void 메서드3() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		//모든 폴더 생성
		File 폴더들 = new File(바탕화면경로 + "/뉴1/뉴2/뉴3");
		폴더들.mkdirs();
		
		//파일 생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
			
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일이 생성 되었나요?" +파일생성확인);
		
			//파일 크기 확인
			System.out.println(파일.length());
			//파일 마지막 수정일 확인
			System.out.println(파일.lastModified());
			//파일 삭제
			파일.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void 메서드4() {
		//파일 이름 변경하기
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트파일 = new File(바탕화면경로 +"/newFFF/파일생성이름바꾸기.txt");
		try {
			
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void 메서드5() {
		//파일 이름 변경하기
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트 = new File(바탕화면경로 +"/newFFF/파일생성이름바꾸기.txt");
		File 새로운이름 = new File(바탕화면경로+ "/newFFF/변경된이름.txt");
		
		//파일 이름 변경하기
		//만약에 파일이 존재할 경우 -> 파일 이름 변경 존재하지 않으면 변경 X
		if(텍스트.exists()) {
			//만약에 파일 이름을 성공적으로 변경했다면
			if(텍스트.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성종적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		}else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요/");
		}
	}
	
	//main 메서드 하나 만들기
	public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		//파일.메서드1();
		//파일.메서드2();
		//파일.메서드3();
		//파일.메서드4();
		파일.메서드5();
	}
}
