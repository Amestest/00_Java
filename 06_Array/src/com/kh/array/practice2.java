package com.kh.array;

public class practice2 {

	public static void main(String[] args) {
		
		int numbers[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length-i;
			System.out.println("numbers[" + i + "] = " + numbers[i]);
			
			
		}
		
	}

}
