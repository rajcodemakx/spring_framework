package com.stratgy;

public class UPI implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println(amount + " ₹ has received from UPI");
	}

}
