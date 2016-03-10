package base;

import java.io.*;

public class InsufficientFundsException extends Exception {
	private double requirement;

	public InsufficientFundsException(double requirement) {
		this.requirement = requirement;
		System.out.print("Insufficient Funds!");
	}

	public double getRequirement() {
		return requirement;
	}
}