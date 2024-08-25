package org.tightCoupling.target;

import org.tightCoupling.dependent.UPI;

public class CashCollector {

    public UPI upi;

    public void setUpi(UPI upi) {
        this.upi = upi;
    }

    public void payment(double amount) {
        upi.pay(amount);
    }
}
