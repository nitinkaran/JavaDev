package com.nitin.polymorphism.challenge;

public class Car {
	
 private boolean engine;
 private String name;
 private int wheels;
 private int cylinders;
public Car( String name, int cylinders) {
	
	this.name = name;
	this.cylinders = cylinders;
	this.engine= true;
	this.wheels = 4;
		
}

public String startEngine() {
	return  "car -> startEngine() ";
}

public String acelrate() {
	return "car -> acelrate()";
}

public String brake() {
	return "car -> brake()";
}


public String getName() {
	return name;
}

public int getCylinders() {
	return cylinders;
}


}

 class Porche extends Car{

	public Porche(String name, int cylinders) {
		super(name, cylinders);
		
	}

	@Override
	public String startEngine() {
		
		return getClass().getSimpleName()+ " -> StartEngine()";
	}
	
	@Override
	public String acelrate() {
		
		return getClass().getSimpleName() + " -> accelrate()";

	}

	@Override
	public String brake() {
		
		return getClass().getSimpleName() + " -> brake()";
	}	
	 
 }

 class Lambo extends Car
 {

	public Lambo(String name, int cylinders) {
		super(name, cylinders);
			 
		
	}

	@Override
	public String startEngine() {
		
		return getClass().getSimpleName() + " -> StartEngine()";
	}

	@Override
	public String acelrate() {
		
		return getClass().getSimpleName() + " -> accelrate()";

	}

	@Override
	public String brake() {
		
		return getClass().getSimpleName() + "-> brake()";

	}
	 
 }
	

