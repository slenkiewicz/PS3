package base;

import java.util.Date;

public class account {
	private int id;
	private double balance;
	private double annualinterestRate;
	private double withdrawAmount;
	private double depositAmount;
	private Date dateCreated;

	public account() {
	}

	public account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualinterestRate() {
		return annualinterestRate;
	}

	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void printBalance() {
		System.out.print("Your current balance is" + getBalance());
	}

	public double getMonthlyInterestRate() {
		return getAnnualinterestRate() / 12;
	}

	public double withdraw(double withdrawAmount) throws InsufficientFundsException {
		if (withdrawAmount <= getBalance()) {
			setBalance(balance - withdrawAmount);
			return getBalance();
		} 
		else {
			double requirement = withdrawAmount - getBalance();
			throw new InsufficientFundsException(requirement);
		}
	}

	public double deposit(double depositAmount) {
		setBalance(balance + depositAmount);
		return getBalance();
	}
}