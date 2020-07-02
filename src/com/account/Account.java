package com.account;

public class Account {
	
	private int accountBalance;

	public void depositMoney(int amountToBeDeposited) {
		
			if (amountToBeDeposited > 0) {
		
			accountBalance += amountToBeDeposited;
			}
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void withdraw(int amountToBeWithdrawn) {
		
			accountBalance -= amountToBeWithdrawn;
	}

	public void withDrawWithPin(int Pin, int amount) {
			if (Pin == 1234) {
				accountBalance -= amount;
			}
			
		
	}

	public void withDrawMoney(int amountOfMoney) {
		if (accountBalance < amountOfMoney || accountBalance <= 1000) {
			System.out.println("You have insufficient balance in your account");
		} else {
			accountBalance -= amountOfMoney;
		}
		
	}

			
			
		
	
	
		
}
