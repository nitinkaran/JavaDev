package com.nitin.composition;

public class Case {

	private String model;
	private String manufaturer;
	private String powerSupply;
	private Dimension dimension;
	public Case(String model, String manufaturer, String powerSupply, Dimension dimension) {
		this.model = model;
		this.manufaturer = manufaturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	public void pressPowerButton() {
		System.out.println("Power Button Pressed..");
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
}
