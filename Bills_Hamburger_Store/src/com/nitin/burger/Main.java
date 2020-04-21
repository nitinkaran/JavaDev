package com.nitin.burger;

public class Main {

	public static void main(String[] args) {
	
	HamBurger hamburger = new HamBurger("Basic", 100, "White", "Sausage");
		//double price = hamburger.itemizeHamburger();
		hamburger.additionhamburger1("Sauce", 10);
		hamburger.additionhamburger2("Tomatto",10);
		hamburger.additionhamburger3("Cream", 20);
		hamburger.additionhamburger4("ChillySauce", 5);
		System.out.println(" Total price of burger is : " + hamburger.itemizeHamburger());
		System.out.println("----------------------------------------------------------------");
		
		
		HealthyBurger healthy = new HealthyBurger(150, "Bacon");
		
		healthy.addhealthyExtraEdition1("Egg", 10);
		healthy.addhealthyExtraEdition2("Lentils", 8);
		System.out.println(" Total healthy burger price is : " + healthy.itemizeHamburger());
		System.out.println("----------------------------------------------------------------");
		
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		System.out.println("Total Deluxe burger price is : " + deluxeBurger.itemizeHamburger());
		System.out.println("----------------------------------------------------------------");
		
	}

}
