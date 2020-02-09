package com.add.number;

import java.util.Scanner;

public class AddNumbers {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
	System.out.println(" enter the first number \n");
	int firstNumber = sc.nextInt();
	
	System.out.println(" enter the second number");
	int secondNumber = sc.nextInt();
	
	int add = firstNumber + secondNumber;
	
	System.out.println(" the add of two numbers : " + add);
	}


}
