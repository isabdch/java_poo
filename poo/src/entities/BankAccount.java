package entities;

public class BankAccount {
	private int number;
	private String holder;
	private double balance;
	
	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public double deposit(double depositValue) {
		return balance += depositValue;
	}
	
	public double withdraw(double withdrawValue) {
		return balance -= withdrawValue + 5.00;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $%.2f%n", number, holder, balance);
	}
}
