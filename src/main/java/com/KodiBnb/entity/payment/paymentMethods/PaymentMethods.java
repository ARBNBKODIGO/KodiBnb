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
        "Por favor seleccione una opcion de pago: \n"
            + "1. Tajeta de Debito/Credito\n"
            + "2. Paypal\n"
            + "3. Regresar a la seccion anterior");
    Scanner leer = new Scanner(System.in);
    int opcion = leer.nextInt();

    switch (opcion) {
      case 1:
        {
          System.out.println("Pagar con tarjeta");
          Card tarjeta = new Card();
          tarjeta.payment(precioHabitacion);
          break;
        }
      case 2:
        {
          PayPall paypal = new PayPall();
          paypal.payment(precioHabitacion);
          break;
        }
      case 3:
        {
          System.out.println("Volver a la seccion anterior con $" + precioHabitacion);
          break;
        }
      default:
        {
          System.out.println("Por favor seleccione una opcion valida");
          mostrarOpciones(precioHabitacion);
          break;
        }
    }
  }
}
