package com.abhikdutta.patterns.adapter;

public class PaymentAdapter {
	PaymentProcessor payProcessor = new PaymentProcessorImpl();
	public void pay(int amountInRupees) {
		double amountInDollars = amountInRupees/82.0;
		payProcessor.pay(amountInDollars);
	}
}
