package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	String name;
	String rollNum;
	Properties marks;
	List<String> hobbies;
	Set<String> teachers;
	Map<String,String> teacherBySubject;
	
	 public void init() {
		 System.out.println("Inside init method");
	 }
	
	
	public Student(String name, String rollNum){
		this.name = name;
		this.rollNum = rollNum;
	}

	public Student() {
		System.out.println("Inside constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	
	public static Student getStudent(){
		Student stud = new Student();
		stud.setName("esh1");
		stud.setRollNum("123");
		return stud;
	}

	public Properties getMarks() {
		return marks;
	}

	public void setMarks(Properties marks) {
		this.marks = marks;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<String> teachers) {
		this.teachers = teachers;
	}

	public Map<String, String> getTeacherBySubject() {
		return teacherBySubject;
	}

	public void setTeacherBySubject(Map<String, String> teacherBySubject) {
		this.teacherBySubject = teacherBySubject;
	}
}
