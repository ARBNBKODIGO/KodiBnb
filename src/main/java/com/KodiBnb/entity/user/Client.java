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
    public void makeBooking(Property property) {
        while (true){
            try{
                int option;
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Scanner sc = new Scanner(System.in);
                System.out.println("""
                        Select:
                        0- To go Back
                        1- To make a reservation""");

                option = sc.nextInt();
                if(option < 0 || option > 1) throw new Exception();
                if(option == 0) break;

                try {
                    property.showBookings();
                    System.out.println("Please enter a date that has not been taken");
                    String starDateString;
                    String endingDateString;
                    sc.nextLine();
                    System.out.println("enter the start date of the reservation");
                    starDateString = sc.nextLine();

                    System.out.println("enter the end date of the reservation");
                    endingDateString = sc.nextLine();
                    System.out.println(starDateString+ "---" + endingDateString);
                    Date startDate = sdf.parse(starDateString);
                    Date endingDate = sdf.parse(endingDateString);
                    property.validateBooking(startDate,endingDate);
                }
                catch (Exception e){
                    System.out.println("Please input a valid format dd-MM-yyyy" + e);
                }

                }
            catch (Exception e) {
                System.out.println("Please enter a valid option");
            }
        }
    }

    public void showPropertyBookings() {
        for (int i = 0; i < myBookings.size(); i++) {
            System.out.println(i + "- " + myBookings.get(i));
            myBookings.get(i).showBookings();
            System.out.println("-----");
        }
    }

    public void deleteBooking(){
        while (true){
            try{
                int option;
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Scanner sc = new Scanner(System.in);
                System.out.println("""
                        Select:
                        0- To go Back
                        1- To delete a reservation""");
                option = sc.nextInt();
                if(option < 0 || option > 1) throw new Exception();
                if(option == 0) break;
                try{
                    System.out.println("Propertys with bookings");
                    showPropertyBookings();
                    System.out.println("Please enter the number of the property you " +
                            "wish to cancel the reservation for");
                    sc.nextLine();
                    option = sc.nextInt();
                    if(option < 0 || option >= myBookings.size()) throw new Exception();
                    myBookings.get(option).deleteBooking();

                } catch (Exception e) {
                    System.out.println("Please enter a valid option");
                }


            } catch (Exception e){
                System.out.println("Please enter a valid option");
            }

        }


    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() +
                "email=" + getEmail() +
                '}';
    }


    /*
  + Reservar

  + Rentar

  + Cancelar reservacion(RESERVA)

  + Cancelar renta
   */

}
