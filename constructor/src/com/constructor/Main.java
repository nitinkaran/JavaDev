package com.constructor;

public class Main {

	public static void main(String[] args) {
//		BankAccount nitinsAccount = new BankAccount();
//		
//		nitinsAccount.withdraw(100);
//
//		nitinsAccount.depositFund(50);
//		nitinsAccount.withdraw(100);
//		
//		nitinsAccount.depositFund(50);
//		nitinsAccount.withdraw(100);
		
		VipCustomer karanni = new VipCustomer();
		System.out.println(karanni.getName());
		
		VipCustomer rakesh = new VipCustomer("Rakesh" , 234567);
		System.out.println(rakesh.getEmail());
		
	}

}
