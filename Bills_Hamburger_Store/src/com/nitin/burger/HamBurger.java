package com.nitin.burger;

public class HamBurger {

	private String name;
	private double basePrice;
	private String breadRolltype;
	private String meat;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	
	public HamBurger(String name, double basePrice, String breadRolltype, String meat) {
		this.name = name;
		this.basePrice = basePrice;
		this.breadRolltype = breadRolltype;
		this.meat = meat;
	}
	
	public void additionhamburger1(String name, double price)
	{
		this.addition1Name = name;
		this.addition1Price = price;
	}
	public void additionhamburger2(String name, double price)
	{
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void additionhamburger3(String name, double price)
	{
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void additionhamburger4(String name, double price)
	{
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		
		double hamburgerPrice = this.basePrice;
		
		System.out.println(this.name + " hamburger " + " on a " + this.breadRolltype + " roll " + " with " + this.meat +
				" , price is " + this.basePrice + " " );
		
		if(this.addition1Name!=null) {
			
			System.out.println("Added " + this.addition1Name + " for an extra rupees " + this.addition1Price);
			hamburgerPrice+=this.addition1Price;
		}
		
		if(this.addition2Name!=null) {
			System.out.println("Added " + this.addition2Name + " for an extra rupees " + this.addition2Price);
			hamburgerPrice+=this.addition2Price;
			  
		}
		
		if(this.addition3Name!=null) {
			System.out.println("Added " + this.addition3Name + " for an extra rupees " + this.addition3Price);
			hamburgerPrice+=this.addition3Price;
		}
		
		if(this.addition4Name!=null) {
			
			System.out.println("Added " + this.addition4Name + " for an extra rupees " + this.addition4Price);
			hamburgerPrice+=this.addition4Price;
		}
		
		return hamburgerPrice;
		
		
	}
	
	
}
