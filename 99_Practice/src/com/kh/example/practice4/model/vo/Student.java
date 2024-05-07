package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
		
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	//메서드 생성자 기본
	public Student() {
		
		
	}
	
	//메서드 void
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : "  + height);
		System.out.println("성별 : " + gender);
	
	
	}
	
	
}
