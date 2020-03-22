package com.nitin.binary;

import java.util.Scanner;

public class Main {
	
	static int size;
	static int X ;
	static int beg = 0 ;
    static int end ;
    
   
    
	static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		 
		
		System.out.println("------------------------------------");
		System.out.println(" enter the size of Array");
		size = s.nextInt();
		System.out.println("------------------------------------");
		System.out.println(" enter the no. to be searched");
		X = s.nextInt();
		
		//System.out.println(beg);
		
		end = size -1;
		//System.out.println(end);
		
		int arr[] = new int[size];
		
		System.out.println(" enter the elements of Array");
		for(int i = 0 ; i< arr.length ; i++) {
			
			arr[i] = s.nextInt();
			
		}
		
		
		
		BinarySearch bs = new BinarySearch();
		bs.search(beg, end,  X , arr);
		

	}

}
