package com.constructor;

public class VipCustomer {

	private String name;
	private String email;
	private int accountNumber;
	
	public VipCustomer() {
		this("karan" , "karan@gmail.com" , 12345);
	}
	
	
	
	public VipCustomer(String name, int accountNumber) {
		this( name , "email@email.com" , 112234);
		
	}



	/**
	 * @param name
	 * @param email
	 * @param accountNumber
	 */
	public VipCustomer(String name, String email, int accountNumber) {
		this.name = name;
		this.email = email;
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
}
