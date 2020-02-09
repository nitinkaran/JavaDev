package com.add.number;

import java.util.Scanner;

public class AddNumbers {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
	System.out.println(" enter the first number ");
	int firstNumber = sc.nextInt();
	
	System.out.println(" enter the second number");
	int secondNumber = sc.nextInt();
	
	System.out.println("enter the third number");
	int thirdNumber = sc.nextInt();
	
	int add = firstNumber + secondNumber + thirdNumber;
	
	System.out.println(" the addition of three numbers : " + add);
	}


}
