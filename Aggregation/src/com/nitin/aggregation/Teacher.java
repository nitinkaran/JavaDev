package com.nitin.aggregation;

class Teacher
{
	String name;
	String degree;
	String subject;
	Address addr;
	public Teacher(String name, String degree, String subject, Address addr) {
		this.name = name;
		this.degree = degree;
		this.subject = subject;
		this.addr = addr;
	}
	public void displayTeacher() {
		System.out.println("Teacher_Name :" + name + "" );
		System.out.println("Degree: " + degree + "" );
		System.out.println("Subject :" + subject + "" );
	}
		
}
