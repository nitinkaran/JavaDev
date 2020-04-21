package com.nitin.composition;

public class Main {

	public static void main(String[] args) {
		Dimension dimension = new Dimension(20, 20, 5);
		Case thecase = new Case("220B", "Dell", "240", dimension);
		Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 4, "v2.44");
        PC thePc = new PC(thecase, monitor, motherboard);
        thePc.powerUp();
	}

}
