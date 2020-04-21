package com.nitin.aggregation;

public class Main {

	public static void main(String[] args) {
		Address add = new Address(45, "Vishwavidyalaya Road", "Sector 71");
		add.display();
		System.out.println("-------------------------------------------------------");
		Student st = new Student("nitin", 31, "RIET", add);
		st.displayStudent();
		
		System.out.println("-------------------------------------------------------");
		
         
        	 Teacher t = new Teacher("Ram", "PHD", "Data Structure", add);
        	 
    	     t.displayTeacher();
        
		
	}

}
