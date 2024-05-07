package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//메서드
	//생성자 : 기본
	public ArrayPre() {
		
	}
	
	//void
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 제일 먼저
		// 숫자인지 문자열인지 문자인지 실수인지 구분을 해준후 [] 표시 작성
		
		//index      0 1 2 3 4     length = 5
		int[] num = {1,2,3,4,5,};
		int result = 0;
		
		// for - each 문 처음부터 끝까지 반복해서 무언가를 진행할 때 사용
		//          {1,2,3,4,5}
		for(int 숫자   :num     ) {
			// num 안에 있는 모든 숫자가 하나씩 숫자 안에 들어가고
			// 숫자들의 합
			result += 숫자;
		}
		System.out.println("숫자들의 합 : " + result);
	}

	public void practice2() {
		// ArrayList 사용해서 물건 추가하기
		// new ArrayList<>()는 <>안에 String을 넣어도 되고 안넣어도 됨 
		ArrayList<String> goods = new ArrayList<>();
		//상품을 추가할 때는 add 더하기
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("TV");
		goods.add("에어컨");
	
		//모두 보기 2가지
		System.out.println(goods);
		
		//for - each 문 활용해서 사용
		for(String allGoods : goods) {
			System.out.print(allGoods+ " ");
		}
	}

	public void practice3() {
		//배열을 사용해서 최대값 찾기
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0]; //numbers[0] = 3
		
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최대값 : " + max);
	}
	
	public void practice4() {
		// 찾음 못찾음
		//과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과", "바나나","오렌지"};
		
		String search = "키위";
		boolean found = false;//아직 찾았는지 안찾았는지 모르기 때문에 false
		
		// for - each 문 활용해서 바나나 찾기
		for(String f :fruits) {
			
			//만약에 내가 찾는 과일과 이름이 똑같다면 찾았다~! 해주기
			
			if(f.equals(search)) {
				found = true;
				break; // 찾았기 때문에 이름이 똑같은지 확인하는 if문 탈출
			}
		}
		System.out.println(search + "찾음?" + (found ? "찾음" : "못찾음"));
	}

	public void practice5() {
		//스캐너 동물을 입력하고 배열에 동물이 있는지 확이할 것
		// 4 search 스캐너로 변경
		//String zoo = {"코끼리","원숭이","푸바오","토끼","공작"};
		
		
		String[] zoo = {"코끼리","원숭이","푸바오","토끼","공작"};
		Scanner sc = new Scanner(System.in);
		System.out.println("보고싶은 동물을 입력하세요 : ");
		String search = sc.next();
		boolean found = false;
		for(String animal:zoo) {
			if(animal.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + "찾았습니까?" + (found ? "찾았어요.":"못찾았어요."));
	}

}
