package com.kh.JavaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		
		//1. yyyy-MM-dd
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 날짜표시 = 날짜1.format(date);
		System.out.println("예제1번 " + 날짜표시);
		
		//2. HH:mm:ss
		SimpleDateFormat 시간1 = new SimpleDateFormat("HH:mm:ss");
		//Date date2 = new Date();
		String 시간표시 = 시간1.format(date);
		System.out.println("예제2번 " + 시간표시);
		
		//3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜시간 = new SimpleDateFormat("yyyy-MM-ss HH:mm:ss");
		//Date date3 = new Date();
		String 날짜시간표시 = 날짜시간.format(date);
		System.out.println("예제3번 " + 날짜시간표시);
	
		//4. SimpleDateFormat 날자 4 = E 를 사용해서 요일 나타내기
		SimpleDateFormat 날짜4 = new SimpleDateFormat("E");
		//Date date4 = new Date();
		String 요일 = 날짜4.format(date);
		System.out.println("예제4번 " + 요일);
	}

}
