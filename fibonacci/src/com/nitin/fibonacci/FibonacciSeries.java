package com.nitin.fibonacci;

public class FibonacciSeries {

	int x = 0; 
	int y = 1 ;
	
	int Res;
	
	public void fibo(int range)
	{
	
		System.out.print(x + " " + y);
		for(int i = 2 ; i < range ; i++)
		{
			
			Res = x + y;
			x = y ;
			y = Res ;
			System.out.print(" ," + Res + " " );
		}
		
	}
	
	
}
