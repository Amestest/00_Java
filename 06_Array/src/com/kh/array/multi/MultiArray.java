package com.kh.array.multi;
/*
   다차원배열
   2차원 이상의 배열
   배열 요소로 다른 배열을 가지는 배열 
   사용 예제
   2차원 배열 기준 
   자료형[][] 배열명;
   자료형 배열명 [][];
   바료형[] 배열명[];
   
   자료형[][] 배열명 = new 자료형[숫자값][숫자값];
   int[][] arr = {
   					{10, 20, 30},
   					{40, 50, 60}
   								}
 
 
 */
public class MultiArray {
	public static void main(String[] args) {
		//2차원 배열만들기
		int[][] numbers = {
				{1,2,3,},
				{4,5,6,},
				{7,8,9,}
			};
		System.out.println("2차원 배열 출력하기");
	
		numbers[0][0] = 1;
		
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		
		//for 문 으로 출력하기
		for(int i=0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}

