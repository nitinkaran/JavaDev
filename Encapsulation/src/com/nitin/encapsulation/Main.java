package com.nitin.encapsulation;

public class Main {

	public static void main(String[] args) {
//		Printer printer = new Printer(true, 50);
//		System.out.println("initial page count = " + printer.getPagesPrinted());
//		int printPages = printer.printPages(4);
//		System.out.println("pages printed was " + printPages + " new total print count for printer : " + printer.getPagesPrinted());
//	    printPages = printer.printPages(10); 
//      	System.out.println("pages printed was " + printPages + " new total print count for printer : " + printer.getPagesPrinted());
//	
		
		Printer_1 printer1 = new Printer_1(500,true);
		//printer1.fillToner(500);
		System.out.println("initially page count = " + printer1.getPrintingPages() );
		int printPages= printer1.printPage(4);
		System.out.println("pages printed was " + printPages + " New total print count for printer : " + printer1.getPrintingPages());
		System.out.println("----------------------------------------------------------------------------------------------------------");
		printPages= printer1.printPage(2);
		System.out.println("pages printed was " + printPages + " New total print count for printer : " + printer1.getPrintingPages());
     	
		
	}

}
