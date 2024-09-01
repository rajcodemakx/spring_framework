package com.stratgy;

public class CreditCard implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println(amount + " ₹ has received from creditcard");
	}

}
