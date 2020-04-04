package com.nitin.polymorphism.challenge;

public class Main {

	public static void main(String[] args) {
		Porche p = new Porche("Porche 911", 4);
		
		System.out.println(p.getName());
		System.out.println(p.startEngine());
		System.out.println(p.acelrate());
		System.out.println(p.brake());
		
		
		System.out.println("---------------------------------");
	
		Lambo lm= new Lambo("Avantador", 6);
		
		System.out.println(lm.getName());
		System.out.println(lm.startEngine());
		System.out.println(lm.acelrate());
		System.out.println(lm.brake());
		
	}

}
