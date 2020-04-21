package com.nitin.composition;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int cardSlots;
	private int ramSlots;
	private String bios;
	
	
	
	public Motherboard(String model, String manufaturer, int cardSlots, int ramSlots, String bios) {
		this.model = model;
		this.manufacturer = manufaturer;
		this.cardSlots = cardSlots;
		this.ramSlots = ramSlots;
		this.bios = bios;
	}

	public void loadProgram(String program) {
		System.out.println("program " + program + " is loading....");
	}
	
 String getModel() {
		return model;
	}
 void setModel(String model) {
		this.model = model;
	}
 String getManufaturer() {
		return manufacturer;
	}
 void setManufaturer(String manufaturer) {
		this.manufacturer = manufaturer;
	}
 int getCardSlots() {
		return cardSlots;
	}
 void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}
 int getRamSlots() {
		return ramSlots;
	}
	
	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	
	public String getBios() {
		return bios;
	}
	
	public void setBios(String bios) {
		this.bios = bios;
	}
	

}
