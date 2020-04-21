package com.nitin.aggregation;

class Student {
	
	String name;
	int rollNumber;
	String college;
	Address adr;
	public Student(String name, int rollNumber, String college, Address adr) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.college = college;
		this.adr = adr;
	}
	
	public void displayStudent() {
		System.out.println("Student_Name :" + name + "" );
		System.out.println("Student_RollNumber: " + rollNumber + "" );
		System.out.println("College :" + college + "" );
	}
	
}
