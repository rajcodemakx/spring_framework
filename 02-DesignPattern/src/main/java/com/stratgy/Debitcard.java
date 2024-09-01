package com.stratgy;

public class Debitcard implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println(amount + " ₹ has received from debitcard");
	}

}
