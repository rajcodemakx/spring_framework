package com.stratgy;

public class Main {

	public static void main(String[] args) {

		// constructor injection
		BillCollector billCollector = new BillCollector(new CreditCard());
		billCollector.payment(2000);

		// setter injection
		BillCollector billCollectorSetter = new BillCollector();
		billCollectorSetter.setPayment(new Debitcard());
		billCollectorSetter.payment(3000);

		// field injection
		BillCollector field = new BillCollector();
		field.payment = new UPI();
		field.payment(4000);

	}

}
