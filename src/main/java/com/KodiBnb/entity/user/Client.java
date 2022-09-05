package com.KodiBnb.entity.user;

public class Client extends User {
    public Client(String name, String email, String password, String celphone) {
        super(name, email, password, celphone);
    }


    /*
  + Reservar

  + Rentar

  + Cancelar reservacion(RESERVA)

  + Cancelar renta
   */

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() +
                "}";
    }
}
