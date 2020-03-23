package com.nitin.fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int range;
		System.out.println(" Enter the range for series ");
		range = sc.nextInt();

		FibonacciSeries fs = new FibonacciSeries();
				fs.fibo(range);
	}

}
