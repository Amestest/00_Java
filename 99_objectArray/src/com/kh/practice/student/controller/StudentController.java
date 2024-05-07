package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	//5개가 들어갈 배열을 만들어주는데 학생으로 만들어주세요.
	/*Student[] sArr = new Student[5]
	 * 
	 * 	   ┌sArr[0] 이름 과목 점수
	  	   ├sArr[1] 이름 과목 점수
	 Studnt├sArr[2] 이름 과목 점수
	  sArr ├sArr[3] 이름 과목 점수
	  	   └sArr[4] 이름 과목 점수
	  */
	
	
	
	private Student[] sArr =new Student[5];
	public static final int CUT_LINE = 60;//상수
//메서드
	//생성자 :  기본
	public StudentController() {
		//0번째 학생 4번째 학생까지 값을 넣어주라기
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	//반환 메서드
	// 
	public Student[] printStudent() {
		return sArr;
	}
	
	//학생들의 점수를 모두 더해서 총점을 꼐산
	public int sumScore() {
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//마지막으로 총합을 sumScore를 부른다면 내가 가진 점수를 보여주겠다
		return sum;
	}
	//총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //위에서 만든 모든 학생의 총점 더한 값을 저장하는 공간 0
		avgArr[1] = avgArr[0] / sArr.length; // 평균 = 총점 / 총학생수
		return avgArr;
	}
	//총점에서 배열을 사용하지 않고 평균 구하기
	public double avgScore2() {
		double avgArr = sumScore()/sArr.length;
		return avgArr;
		
	}
	
	
	//각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass() {
		for (Student s :sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + "학생은" + (s.isPassed()?"통과": "불합격") + "입니다.");
			
			/*
			if(s.getScore() >= CUT_LINE) {
				System.out.println(s.getName() + " 학생은 합격입니다.");
			} else {
				System.out.println(s.getName() + " 학생은 불합격입니다.");
			}
			*/
			
			
		}
	}




}


