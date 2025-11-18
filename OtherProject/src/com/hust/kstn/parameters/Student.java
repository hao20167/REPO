package com.hust.kstn.parameters;

public class Student {
	protected int StudentId;
	protected String name;
	
	public Student(int StudentId, String name) {
		this.StudentId = StudentId;
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
}
