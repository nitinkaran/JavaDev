package com.nitin.composition;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResoution;
	public Monitor(String model, String manufaturer, int size, Resolution nativeResoution) {
		this.model = model;
		this.manufacturer = manufaturer;
		this.size = size;
		this.nativeResoution = nativeResoution;
	}
	
	public void drawPixelAt(int x , int y , String color) {
		System.out.println("drawing pixel at " + x + "," + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufaturer() {
		return manufacturer;
	}

	public void setManufaturer(String manufaturer) {
		this.manufacturer = manufaturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeResoution() {
		return nativeResoution;
	}

	public void setNativeResoution(Resolution nativeResoution) {
		this.nativeResoution = nativeResoution;
	}
	

}
