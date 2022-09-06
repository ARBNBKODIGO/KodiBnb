package com.KodiBnb.entity.user;

import com.KodiBnb.entity.booking.Booking;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    @Getter @Setter
    private List<Booking> myBookings = new ArrayList<Booking>();

    public Client(String name, String email, String password, String celphone) {
        super(name, email, password, celphone);
    }


    /*
  + Reservar

  + Rentar

  + Cancelar reservacion(RESERVA)

  + Cancelar renta
   */

}
