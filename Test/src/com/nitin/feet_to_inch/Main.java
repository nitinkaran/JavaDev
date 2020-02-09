package com.nitin.feet_to_inch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double centimeters =  calcFeetAndInchesInCentimeteres(5, 13);
		if(centimeters<0.0)
		{
			System.out.println(" Invalid Parameteres");
		}

	}
	
	
	public static double calcFeetAndInchesInCentimeteres(double feet , double inches)
	{
		
		if( (feet<0) || ((inches<0 || inches>12)))  
		{
			System.out.println("Invalid feet or Inches parameters");
			return -1;
		}
		
			double cm = (feet * 12)* 2.54;
			double centimeters = cm + (inches*2.54);
			
			System.out.println("the centimeter value is :" + centimeters);
			
		
		return centimeters;
		
	}

}
