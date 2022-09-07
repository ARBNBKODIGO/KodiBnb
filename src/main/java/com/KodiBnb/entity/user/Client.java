package com.KodiBnb.entity.user;

import com.KodiBnb.entity.booking.Booking;
import com.KodiBnb.entity.property.Property;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Client extends User {

    @Getter @Setter
    private List<Property> myBookings = new ArrayList<Property>();

    public Client(String name, String email, String password, String celphone) {
        super(name, email, password, celphone);
    }
    public void makeBooking() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        String starDateString;
        String endingDateString;
        System.out.println("enter the start date of the reservation");
        starDateString = sc.nextLine();
        System.out.println("enter the end date of the reservation");
        endingDateString = sc.nextLine();

        Date startDate = sdf.parse(starDateString);
        Date endingDate = sdf.parse(endingDateString);

        Booking newBooking = new Booking(startDate,endingDate);

    }


    /*
  + Reservar

  + Rentar

  + Cancelar reservacion(RESERVA)

  + Cancelar renta
   */

}
