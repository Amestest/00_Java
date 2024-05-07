package com.kh.JavaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substring 메서드를 사용해서 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 문자열1 = 문제1.substring(0,5);
		System.out.println(문자열1);
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String 문자열2 = 문제2.toUpperCase();
		System.out.println(문자열2);
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 문자열3 = 문제3.toLowerCase();
		System.out.println(문자열3);
		// split 활용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] 문자열4 = 문제4.split(" ");
		for(String 나열 : 문자열4) {
			System.out.println(나열);
		}
		// replace 활용해서 more 을 less 로 대체
		String 문제5 = "The more, the better";
		String 문자열5 = 문제5.replace("more","less");
		System.out.println(문자열5);
		// charAt 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char 문자열6 = 문제6.charAt(6);
		System.out.println(문자열6);
		// substring 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 문자열7 = 문제7.substring(14);
		System.out.println(문자열7);
	}

}
