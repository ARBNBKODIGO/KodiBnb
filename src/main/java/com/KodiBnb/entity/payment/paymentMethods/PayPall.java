package com.KodiBnb.entity.payment.paymentMethods;

import java.util.ArrayList;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

public class PayPall implements IPaymentMethods {
  @Getter @Setter private String password;
  @Getter @Setter private double balance;
  @Getter @Setter private String email;
  private boolean valor = true;
  private ArrayList<String> datos = new ArrayList<String>();

  @Override
  public void payment(double cost) {
    obtenerDatos();
    if (validarDatos(datos)) {
      System.out.println(
          "Se ha realizado el pago de su KodiBnB por un valor"
              + " de $"
              + cost
              + "\n Pago realizado mediante  Paypal");
    } else {
      System.out.println("Datos no validos\nEl pago no se pudo realizar, intentelo nuevamente");
    }
  }

  public void obtenerDatos() {
    Scanner leerDatos = new Scanner(System.in);
    System.out.println(
        "Pago con PayPal\n" + "Ingrese su credenciales para validad " + "sus datos.\nEmail:");

    email = leerDatos.nextLine();
    datos.add(email);

    System.out.println("Ingrese su contrasenia:");
    password = leerDatos.nextLine();
    datos.add(password);
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
