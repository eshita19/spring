package com.beans;

public class BeanFactory {

	public Student getStudent(){
		Student student  = new Student();
		student.setName("esh3");
		student.setRollNum("3");
		return student;
	}
}
