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
          "Se ha realizado el pago de su KodiBnB por un "
              + "valor de $"
              + cost
              + "\n Se ha descontado este monto de su tarjeta.");
    } else {
      System.out.println(
          "Datos no validos\n" + "El pago no se pudo realizar, intentelo nuevamente");
    }
  }

  public void obtenerDatos() {

    System.out.println("Pago con tarjeta\n" + "Ingrese su numero de tarjeta sin espacios:");
    Scanner leerDatos = new Scanner(System.in);
    cardNumber = leerDatos.nextLine();
    datos.add(cardNumber);

    System.out.println("Ingrese la fecha de expiracion en formato 00/00:");
    expirationDate = leerDatos.nextLine();
    datos.add(expirationDate);

    System.out.println("Ingrese el CVC de tres digitos que esta en la parte posterior:");
    CVC = leerDatos.nextLine();
    datos.add(CVC);

    System.out.println("Ingrese el nombre que aparece en su tarjeta:");
    nameOwner = leerDatos.nextLine();
    datos.add(nameOwner);

    System.out.println("Ingrese su direccion de facturacion:");
    email = leerDatos.nextLine();
    datos.add(email);

    System.out.println("Ingrese su email:");
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
