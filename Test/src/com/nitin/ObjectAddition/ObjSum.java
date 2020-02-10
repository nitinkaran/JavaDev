package com.nitin.ObjectAddition;

import java.util.Scanner;

public class ObjSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ente two values for first Object");
		int x1 = Integer.parseInt(s.nextLine());
		int x2 = Integer.parseInt(s.nextLine());
		
		System.out.println("Ente two values for second Object");
		int x3 = Integer.parseInt(s.nextLine());
		int x4 = Integer.parseInt(s.nextLine());
		
		Test t1 = new Test(x1, x2);
		Test t2 = new Test(x3 , x4);
		Test t3 = new Test();
		t3 = t1.sum(t2);
		
		System.out.println("T1 values");
		System.out.println("-------------------------------------------");
		
		System.out.println("T2 values");
		System.out.println("-------------------------------------------");
		t2.display();
		System.out.println("Object Sum");
		System.out.println("-------------------------------------------");
		t3.display();
		System.out.println("-------------------------------------------");
		
	}

}
