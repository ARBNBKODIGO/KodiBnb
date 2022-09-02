package com.KodiBnb.entity.payment.paymentMethods;

import lombok.Getter;
import lombok.Setter;

public class PayPall implements IPaymentMethods {
  @Getter @Setter
  private String name;
  @Getter @Setter
  private double balance;
  @Getter @Setter
  private String email;

  @Override
  public void payment(double cost) {
    balance -= cost;
  }

}
