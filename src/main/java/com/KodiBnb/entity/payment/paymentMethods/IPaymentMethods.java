package com.KodiBnb.entity.payment.paymentMethods;

import java.util.ArrayList;

public interface IPaymentMethods {
  public void payment(double cost);

  public void obtenerDatos();

  public boolean validarDatos(ArrayList<String> datos);
}
