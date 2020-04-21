package com.nitin.burger;

public class HealthyBurger extends HamBurger {

	
	private String healthyextra1name;
	private double healthyextra1price;
	
	private String healthyextra2name;
	private double healthyextra2price;
	
	public HealthyBurger( double basePrice, String meat) {
		super("healthy", basePrice, "brown rye", meat);
        //super.additionhamburger1("chutney", 10);
        //super.additionhamburger2("redchili", 20);
	}
	

	public void addhealthyExtraEdition1(String name , double price) {
		this.healthyextra1name = name;
		this.healthyextra1price = price;
	}
	
	public void addhealthyExtraEdition2(String name , double price) {
		this.healthyextra2name = name;
		this.healthyextra2price = price;
	}


	@Override
	public double itemizeHamburger() {
		
		// TODO Auto-generated method stub
	double hamburgerPrice = super.itemizeHamburger();

	if(this.healthyextra1name!=null) {
		
		hamburgerPrice+=this.healthyextra1price;
		System.out.println("Added " + this.healthyextra1name + " for an extra rupees " + this.healthyextra1price);
	}
	if(this.healthyextra2name!=null) {
		
		hamburgerPrice+=this.healthyextra2price;
		System.out.println("Added " + this.healthyextra2name + " for an extra rupees " + this.healthyextra2price);
	}
	
	return hamburgerPrice;

    }
		
	
}
	
