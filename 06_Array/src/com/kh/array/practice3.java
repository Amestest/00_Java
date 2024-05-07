package com.kh.array;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		//양의 정수를 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		
		int size = sc.nextInt();
		//입력 받은 정수 크기의 배열 생성
		int[] numbers = new int[size]; //size = 5
		// numbers.length = size
		for(int i = 0; i < size; i++) {
			numbers[i] = i + 1;
		System.out.print(numbers[i] + " ");	
		}
		
		
	}

}
