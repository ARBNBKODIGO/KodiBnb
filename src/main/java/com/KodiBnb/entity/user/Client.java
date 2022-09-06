package com.KodiBnb.entity.user;

import com.KodiBnb.entity.booking.Booking;
import com.KodiBnb.entity.property.Property;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends User {

    @Getter @Setter
    private List<Property> myBookings = new ArrayList<Property>();

    public Client(String name, String email, String password, String celphone) {
        super(name, email, password, celphone);
    }
    public void makeBooking(){
        Scanner sc = new Scanner(System.in);
        String starDate;
        String endingDate;
        System.out.println("Input property's address");
        starDate = sc.nextLine();
    }

    /*
  + Reservar

  + Rentar

  + Cancelar reservacion(RESERVA)

  + Cancelar renta
   */

}
