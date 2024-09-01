package com.stratgy;

public class BillCollector {

	// Field injection
	public IPayment payment;

	// Setter injection
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	// Constructor injection
	public BillCollector(IPayment payment) {
		this.payment = payment;
	}

	public BillCollector() {
		
	}

	public void payment(double amount) {
		payment.pay(amount);
	}

}
