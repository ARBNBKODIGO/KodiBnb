package com.KodiBnb.entity.payment.paymentMethods;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethods {

  private List<IPaymentMethods> paymentMethods = new ArrayList<IPaymentMethods>();

  public List<IPaymentMethods> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<IPaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }
}
