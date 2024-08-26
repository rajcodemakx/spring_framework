package com.looseCoupling.handler;

import com.looseCoupling.interfaces.PaymentGateWay;

public class BillHandler {

    private final PaymentGateWay paymentGateWay;

    public BillHandler(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    public void payment(double amount) {
        this.paymentGateWay.pay(amount);
    }
}
