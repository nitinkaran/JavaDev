package com.nitin.linearsearch;

public class LinearSearch {
	int flag =0;

	public LinearSearch(int Arr[] , int item ) {
		
		for(int i=0; i< Arr.length; i++)
		{
			if(item == Arr[i])
			{
				flag = 1;
				System.out.println("Element :" + item + " found at index: " + i);
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Element not found in the array");
		}
		
		 
	}

}
