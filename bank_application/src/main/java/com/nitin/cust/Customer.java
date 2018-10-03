package com.nitin.cust;

import com.nitin.bank.bank.application.BankAccount;
import com.nitin.bank.bank.application.SavingsAccount;

public class Customer {
	public static void main(String [] args)
	{
		BankAccount acc1=null;
		acc1= new SavingsAccount();
		acc1.withdraw(4000);
		System.out.println("bank acc"+acc1);
		
	}
}
