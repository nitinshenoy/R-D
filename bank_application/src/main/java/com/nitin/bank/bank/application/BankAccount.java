package com.nitin.bank.bank.application;



/** Documentation based comment
 * 
 * @author nj1
 * @since 3-10-2018
 * 
 *
 */
public class BankAccount {

	// encapsulation - relevant declaration of variables as a part of the class
	
	int accountNo;
	String accountHolderName;
	double accountBalance;

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}


	//2 objects share the property of no.
	static int autoAccountNoGen;
	
	
	{
		//init block ..it will be called before evry object is created
		
		//static init block ---before object created---it  runs
		
		System.out.println("hey");
	}
	
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	
	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void withdraw(double amount) {
		accountBalance-=amount;
	}


	//Variety using constructor overloading



	public BankAccount() {
		accountNo=++autoAccountNoGen;
		accountHolderName="Unknown";
		accountBalance=0;
			
		// TODO Auto-generated constructor stub
	}
	
	
}
