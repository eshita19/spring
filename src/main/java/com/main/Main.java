package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		String[] names = {"esh1", "esh3", "esh4", "esh5"};
		for(String name: names){
			Student student = context.getBean(name, Student.class);
			System.out.println(student.getName() + " " + student.getRollNum());
			System.out.println("Property marks: " +  student.getMarks());
			System.out.println("Set Teachers: " +  student.getTeachers());
			System.out.println("List Hobbies: " + student.getHobbies());
			System.out.println("Student- Marks: " + student.getTeacherBySubject());
		}
	}
}
