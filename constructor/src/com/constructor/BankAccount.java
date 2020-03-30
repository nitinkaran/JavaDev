package com.constructor;

public class BankAccount {
	private String name;
	private double account_number;
	private double balance;
	private String email;
	private int contactNo;
	
	
	public void setAccount_number(double account_number) {
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccount_number() {
		return account_number;
	}
	
	
	public void depositFund(double add) {
		//add+=balance;
		this.balance = this.balance + add;
		System.out.println("deposited amount is rupees : " + add +  " New Balance :" + this.balance);
		
	}
	
	public void withdraw(double deduct) {
		if((balance - deduct)<=0) {
			System.out.println("Only rupees" + this.balance + " is available.You can't withdraw");
		}
		else
		{
			this.balance-=deduct;
			System.out.println("withdrawl of rupees: " + deduct + " has processed and the remaining balance rupees: " + this.balance);
		}
	}
}
