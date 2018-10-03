package com.nitin.bank.bank.application;

public class SavingsAccount extends BankAccount implements InsuranceProvider {

	
	@Override
	public void withdraw(double amount)
	{
		System.out.println("Savings account withdraw method");
	}
	
	public void isSalaryAccount() {
		
		System.out.println("Salary Account");
		
	}

	public void getInsuranceName() {
		// TODO Auto-generated method stub
		
	}

	public void getInsurancePeriod() {
		// TODO Auto-generated method stub
		
	}
}
