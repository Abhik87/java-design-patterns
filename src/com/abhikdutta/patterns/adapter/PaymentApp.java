package com.abhikdutta.patterns.adapter;

public class PaymentApp {
	
	public void pay(int amountInRupees) {
		PaymentAdapter payAdapter = new PaymentAdapter();
		payAdapter.pay(amountInRupees);
	}
	
	public static void main(String args[]) {
		PaymentApp p = new PaymentApp();
		p.pay(10000);
	}

}
