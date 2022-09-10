package com.KodiBnb.entity.payment.paymentMethods;

import java.util.ArrayList;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

public class Card implements IPaymentMethods {

  @Getter @Setter private double balance;
  @Getter @Setter private String nameOwner;
  @Getter @Setter private String cardNumber;
  @Getter @Setter private String email;
  @Getter @Setter private String CVC;
  @Getter @Setter private String expirationDate;
  @Getter @Setter private String direccioinFacturacion;

  private ArrayList<String> datos = new ArrayList<String>();

  private boolean valor = true;

  @Override
  public void payment(double cost) {
    obtenerDatos();
    if (validarDatos(datos)) {
      System.out.println(
              "The payment was completed for KodiBnb "
                      + "with a total of $ "
                      + cost
                      + "\nThat charge has been deducted from your credit card.");
    } else {
      System.out.println(
              "Invalid information\n" + "Payment could not go through, try again please");
    }
  }

  public void obtenerDatos() {

    System.out.println("Payment with card\n" + "Write the 16 digits of your credit card with no spaces:");
    Scanner leerDatos = new Scanner(System.in);
    cardNumber = leerDatos.nextLine();
    datos.add(cardNumber);

    System.out.println("Enter the expiration date with the format MM/YY:");
    expirationDate = leerDatos.nextLine();
    datos.add(expirationDate);

    System.out.println("Enter the security number located in the back of your card, its 3 digits:");
    CVC = leerDatos.nextLine();
    datos.add(CVC);

    System.out.println("Enter the name on the card:");
    nameOwner = leerDatos.nextLine();
    datos.add(nameOwner);

    System.out.println("Enter the billing address:");
    email = leerDatos.nextLine();
    datos.add(email);

    System.out.println("Enter your email:");
    direccioinFacturacion = leerDatos.nextLine();
    datos.add(direccioinFacturacion);
  }

  public boolean validarDatos(ArrayList<String> datos) {
    // Esto solo simula una validacion, en este caso solo comprueba que los datos
    // no esten vacios
    for (String i : datos) {
      if (i == "") valor = false;
    }
    return valor;
  }
}