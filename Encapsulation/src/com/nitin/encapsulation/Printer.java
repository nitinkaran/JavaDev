package com.nitin.encapsulation;

public class Printer {

	private boolean duplex;
	private  int tonerLevel;
	private int pagesPrinted;
	
	public Printer( boolean duplex, int tonerLevel) {
		
		this.duplex = duplex;
		
		if(tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}
		else {
			this.tonerLevel = -1;
		}
		
		this.pagesPrinted = 0;
	}
	
	public int fillToner(int totalAmount)
	{
		
		if(totalAmount > 0 && totalAmount <=100) 
		{
			if(this.tonerLevel + totalAmount> 100) 
			{
				return -1;
			}
			this.tonerLevel+=totalAmount;
			return this.tonerLevel;
		}
		else 
		{
			return -1;
		}
		
	}
	public int printPages(int pages) 
	{
		
		int pagesToPrint = pages;
		if(this.duplex) {
			 pagesToPrint/=2;
			System.out.println("pages are printing in duplex mode");
		}
		this.pagesPrinted+=pagesToPrint;
		return pagesToPrint;
				
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}	
	
}
