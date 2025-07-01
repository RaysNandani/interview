package com.rays.exception;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance =balance+amt;
		//System.out.println(balance);
	}

	public double withdraw(double amt) throws BankException {
		balance = balance - amt;
		
		if (balance < amt) {
			BankException e = new BankException("insufficant balance"
					+ ".....");
			throw e;
		}
		return balance;
	}
}