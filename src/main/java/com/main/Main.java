package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("esh1", Student.class);
		System.out.println(student.getName());
	}
}
