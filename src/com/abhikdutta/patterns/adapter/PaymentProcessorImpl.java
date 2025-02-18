package com.abhikdutta.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	public void pay(double amountInDollars) {
		System.out.println("Paid $"+ amountInDollars);
	}

}
