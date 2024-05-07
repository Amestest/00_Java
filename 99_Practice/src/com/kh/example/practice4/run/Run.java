package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//학생 객체 생성
		Student st = new Student();
		
		st.setName("홍길동");
		st.setGrade(3);
		st.setClassroom(2);
		st.setHeight(200.5);
		st.setGender('남');
		
		//void information
		st.information();
	
	
	
	
	
	}

}
