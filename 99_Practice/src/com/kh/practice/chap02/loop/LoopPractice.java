package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		/*사용자로 부터 단 한개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 몯두출력
		 단, 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자르 ㄹ입력했다면
		 1 이사으이 숫자를 입력해주세요 출력하기*/
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 숫자가 1 미만일 경우 출력해주기
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
			
		//입력받은 숫자가 1이상이면 1부터 입력받은 숫자까지 모두 출력해주기
		for(int i =1; i <= num; i++) {
			System.out.print(i + " ");
			//System.out.println(i + " <=" + num);
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	public void practice4() {
		//1 미만의 숫자가 입력되면 1이상의 숫자를 입력해주세요 출력되면서
		//사용자가 값을 입력하도록 하기
		//숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc =  new Scanner(System.in);
		
		
		
		System.out.print("숫자를 입력해주세요 : ");
		int num; //practice4 안에서 어디에서든 num을 알 수 있도록 바깥으로 호출해줌
		
		//do - while : 조건이 참이 아니어도 무조건 최초 1회는 실행
		do {
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			//1 미만의 숫자가 들어오면 !
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				//조건에 관계없이 do로 인해 무조건 1회 실행되는 것이기 때문에 return이나 break를
				//작성해주지 않아도 될 경우가 많음
			}
		} while(num >1);
		
		//만약에 1보다 커서 밑으로 내려온다면
		//num 부터 1까지 거꾸로 출력해줏는 for문 작성해주기
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하기
		//ex. 정수를 하나 입력하세요 : 8
		// 1+2+3+4+5+6+7+8 = 36
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		//입력 받은 수의 총 합이 들어갈 바구니
		int result = 0; 
		
		// 숫자가 들어왔을 때 1부터 입력받은 숫자까지 더해서 총합구하기
		for(int i =1; i <= num; i++) {
			result += i;
			
			//더해지는 숫자 출력하기
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(result);
	}
	
	
	public void practice7() {
		/*
		 사용자로 부터 두개의 값으 ㄹ입력 받아 그 사이의 숫자 출력하기
		 만일 1 미만의 숫자가 입력됏다면 1 잇아의 숫자를 입력해주세요 출력하기
		 다시 사용자가 값을 입력해서 출력하기 
		  */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int firstNum = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int secondNum = sc.nextInt();
			
			//만약에 첫 번째 숫자와 두 번째 숫자 모두 1보다 크거나 같을 경우
			if(firstNum >= 1 && secondNum >= 1) {
				// 두수를 비교해서
				// 최소값 최대값 구하기
				int 최소값 = Math.min(firstNum, secondNum);
				//math(수학 파일에서)가장 작은 값을 찾는 min을 활용해서
			    //알아서 비교하고 작은 값을 구하게 하기
				//(   ,   ) 괄호 안에 숫자를 넣을 때 숫자 순서는 상관 없음
				// Math에도 random 이 있떤데요 ?!
				//Random파일 Math.random 파일
				// Math에 있는 random보다 Random에 있는 랜덤 기능이 더 
				// 많지만 둘 다 사용하는데 큰 차이는 없음
				int 최대값  = Math.max(firstNum, secondNum);
				//int firstNum <= secondNum
					for(int i = 최소값; i <= 최대값; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
			
		}
		
		
		
		
	}
	
	
	
	/*13과 14번 문제 이줄 for문 문제*/
	public void practice13() {
		//키보드로 숫자를 입력 받고 별찍기를 진행한다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력받은 수 만큼 세로줄 출력 ex) 2
		for(int 세로줄  = 1; 세로줄 <= num; 세로줄++) {
			//한줄씩 별을 만들어 주고 싶음
			//한 줄-하나 두 줄-둘 세줄- 삼 ... num줄 = num
			for(int 별 = 1; 별<= 세로줄; 별++) {
				System.out.print("*");
			}
			//줄바꿈을 해줄 enter가 없으면 가로로 모두 출력
			System.out.println();
		}
		
	}
	
	public void practice14(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int 세로줄  = 1; 세로줄 >= num; 세로줄++) {
			for(int 별 = 1; 별>= 세로줄; 별--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/*이중 포문 
		 * for(int line =num; 조건식; 증감식;){
		  		for(int star = 1; line <=star; star++){
		  		System.out.print(*);
		  		}
		  		System.out.println();
		  }*/
		
	
	}
	
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		// 키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line 은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			//blank 공백을 출력하기 위한 for문
			//line 번째 줄에서는 line개의 공백을 출력하겠다
			for(int blank = 0; blank < line; blank++) {
				System.out.print("  ");
			}
			//star 별을 췰력하기 위한 for문
			//line 번째 줄에서는 size - line 개의 별을 출력
			// 첫 번째 줄 size
			// 두 번재 줄 size - line
			for (int star = size; star > line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	//Greeting : 안녕하세요 인사를 출력하는 메서드
	public void Greeting() {
		System.out.println("안녕하세요");
	}
	//Greeting : 반갑습니다 인사를 출력하는 메서드
	public void greeting2() {
		System.out.println("반갑습니다.");
		
	}
	
	
}
