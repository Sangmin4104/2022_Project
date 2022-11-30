package com.exam.mvc;

public class StudentInformation {
	// 폼태그의 name속성과 일치하는 멤버변수
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;
	
	// getter / setter ==> 어노테이션으로 자동 매핑 (@ModelAttribute)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	
	
}
