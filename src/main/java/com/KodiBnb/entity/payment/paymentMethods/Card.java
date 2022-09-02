package com.KodiBnb.entity.payment.paymentMethods;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Card implements IPaymentMethods {

  @Getter @Setter
  private String nameOwner;
  @Getter @Setter
  private double balance;
  @Getter @Setter
  private String cardNumber;
  @Getter @Setter
  private String email;
  @Getter @Setter
  private String CVC;
  @Getter @Setter
  private Date expirationDate;

  @Override
  public void payment(double cost) {
    balance -= cost;
  }


}
