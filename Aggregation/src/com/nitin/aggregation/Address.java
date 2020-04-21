package com.nitin.aggregation;

public class Address {
	
	int streetNumber;
	String streetName;
	String sector;
	public Address(int streetNumber, String streetName, String sector) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.sector = sector;
	}

	public void display() {
		
		System.out.print("College Address: " +  streetNumber + "," );
		System.out.print( streetName + "," );
		System.out.println( sector );
	}
	
}

