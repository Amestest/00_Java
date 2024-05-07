package com.kh.practice.employee.view;

import com.kh.practice.employee.controller.EmployeeController;
import com.kh.practice.employee.model.vo.Employee;

public class EmployeeMenu {

	private EmployeeController eem = new EmployeeController();
	
public EmployeeMenu() {
	
	
}
	public void printEmployeeMenu() {
		System.out.println("이름 과목 점수");
		System.out.println("-----------");
		for(Employee employee : eem.printEmployee()) {
			System.out.println(employee.inform());
			
		}
		System.out.println("------------");
		System.out.println("총점 : "  + eem.sumScore());
		System.out.printf("평균 : %.2f\n", eem.avgScore()[1]);
		System.out.println("합격여부 : " + (eem.avgScore()[1] >= EmployeeController.CUT_LINE));
	
	
	
	}
}
