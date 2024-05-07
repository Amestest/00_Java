package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

//프로젝트 명 Homework4_Inheritance
public class PersonController {
	//학생자리 3자리
	private Student[] students = new Student[3];

	private int studentIndex = 0;
	
	
	//사람수 세기
	public int[] personCount() {
		int[] counts = new int[2]; //counts[0] = 학생 수 자리 counts[1] = 직장인 수 자리
		counts[0] = studentIndex;
		counts[1] = 0;
		return counts;
	}
	
	// 학생의 정보를 입력하면 정보 저장하기
	public void insertStudent(String name, int age, double height, double weight ,int grade, String major) {
		//학생수 추가하기
		//배열로 쳤을 때 index값이 length보다 초과되면 넣지 못하게 합니다.
		if(studentIndex < students.length) {
		students[studentIndex++] = new Student(name, age, height, weight, grade, major);
	} else {
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
	}
}
	//학생 목록보기
	public Student[] printStudent() {
		return students;
	}
	
}