package com.KodiBnb.entity.payment.paymentMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentMethods {

  private List<IPaymentMethods> paymentMethods = new ArrayList<IPaymentMethods>();

  public List<IPaymentMethods> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<IPaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public static void mostrarOpciones(double precioHabitacion) {

    System.out.println(
        "Please select one payment option: \n"
            + "1. Debit or Credit Card");
    Scanner leer = new Scanner(System.in);
    int opcion = leer.nextInt();

    switch (opcion) {
      case 1:
        {
          System.out.println("Pay with card");
          Card tarjeta = new Card();
          tarjeta.payment(precioHabitacion);
          break;
        }
      default:
        {
          System.out.println("Please select a valid option");
          mostrarOpciones(precioHabitacion);
          break;
        }
    }
  }
}
