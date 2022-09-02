package com.KodiBnb.entity.payment.paymentMethods;

public class PayPall implements IPaymentMethods {
    private String name;
    private double balance;
    private String email;


    @Override
    public void payment(double cost) {
        balance -= cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
