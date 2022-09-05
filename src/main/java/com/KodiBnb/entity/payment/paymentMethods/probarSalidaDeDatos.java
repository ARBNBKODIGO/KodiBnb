package com.KodiBnb.entity.payment.paymentMethods;

public class probarSalidaDeDatos {
  public static void main(String[] args) {

    // Esta clase solo es para probar con el main la funcionalidad. Tendria que llamarse
    // desde donde se vaya a hacer el pago como tipo objeto y el parametro seria el precio
    // de la habitacion que se este eligiendo en ese momento
    double precioHabitacion = 500.25;
    PaymentMethods metodosPago = new PaymentMethods();
    metodosPago.mostrarOpciones(precioHabitacion);
  }
}
