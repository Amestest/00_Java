package com.kh.ExceptionEx;
/*
 Exception 에서 try catch finally
 
 try ctrl space   catch finally
 
 try {
 	//예외가 발생할 순 있지만 실행하는 코드
 	
 } catch(Exception e){
 	//예외가 생겨서 출력이나 실행하는 코드
 
 
 
 } finally{
 	//예외 발생과 관계없이 무조건 실행하는 코드
 	//파일 닫기, 연결 종료 등
 }
  
  */
public class ExceptionFinallyEx {
	public static void main(String[] args) {
		try {
			int 결과 = 10 /0;
		
			
		
		
		} catch(Exception e) {
			System.out.println("고객님 0은 안됩니다. ^^;! ");
		}finally {
			System.out.println("저는 이만 총총총~~!  ");
		}
	
	}
			
}
