package com.nitin.encapsulation;

public class Printer_1 {

	private int tonerLevel;
	private int printingPages=0 ;
	private boolean duplex;
	public Printer_1(int tonerLevel, boolean duplex) {
		if(tonerLevel>-1 && tonerLevel<=100)
		{
			this.tonerLevel = tonerLevel;
		}
		else {
			this.tonerLevel=-1;
			System.out.println("toner level is -1");
			
		}
		
		this.duplex = duplex;
	}
	
//	public int fillToner(int amount) {
//		
//		if(tonerLevel>0 && tonerLevel <=100) 
//		{
//			if(this.tonerLevel + amount > 100)
//			{
//				return -1;
//			}
//			else
//			{
//				tonerLevel+=amount;
//			}
//			
//		}
//		return this.tonerLevel;
//		
//	}
//	
	public int printPage(int pages) 
	{
		int pagesTOPrint = pages;
		
		if(this.duplex) {
			pagesTOPrint= pages/2;
			System.out.println("pages are printing in duplex mode");
		}
		
			this.printingPages= this.printingPages+pagesTOPrint;
		
		
		return pagesTOPrint;
		
		
	}

	public int getPrintingPages() {
		return printingPages;
	}
	
	
}
