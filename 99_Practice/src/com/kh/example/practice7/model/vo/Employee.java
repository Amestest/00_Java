package com.kh.example.practice7.model.vo;

public class Employee {
	//필드
	public int empNo;
	public String empName;
	public String dept;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String address;
	
	//생성자
	public Employee(){
		
	}
	
	public Employee(int empNo, String empName){
		this.empNo = empNo;
		this.empName = empName;
		
	}
	public Employee(int empNo,String empName,String dept, String job,
					int age, char gender, int salary,double bonusPoint, 
					String phone,String address){
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	
}
