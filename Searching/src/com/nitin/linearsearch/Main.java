package com.nitin.linearsearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X;
		System.out.println("Enter the size of Array");
		int Size = s.nextInt();
		System.out.println("-----------------------------------");
		System.out.println("enter the number to be searched");
		X= s.nextInt();
		System.out.println("-----------------------------------");
		
		int Arr[] = new int[Size];
		
		System.out.println("Enter the Array");
        for(int i =0; i<Arr.length; i++)
        {
        	Arr[i]= s.nextInt();
        }

        
        LinearSearch ls = new LinearSearch(Arr , X);
	}

}
