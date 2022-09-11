package com.KodiBnb.entity.property;

import com.KodiBnb.App;
import com.KodiBnb.entity.booking.Booking;
import com.KodiBnb.entity.payment.paymentMethods.PaymentMethods;
import com.KodiBnb.entity.user.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Property {

  private List<Booking> bookings = new ArrayList<Booking>();
  @Getter @Setter private String address;
  @Getter @Setter private double cost;
  @Getter @Setter private int capacity;

  public Property(String address, double cost, int capacity) {
    this.address = address;
    this.cost = cost;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Property{" +
            "address='" + address + '\'' +
            ", cost=" + cost +
            ", capacity=" + capacity +
            '}';
  }

  public void showBookings(){
    System.out.println("Active Bookings of the property: ");
    for (int i = 0; i < bookings.size(); i++) {
        System.out.println(i + "- " + bookings.get(i));
      }
    if(bookings.size() == 0)System.out.println("There is not active bookings in the property");
    System.out.println("__________");
    }



  public void validateBooking(Date startDate, Date endDate, double price){
    boolean validBooking = true;
    double totalPrice;
    if(bookings.size()>=1){
      for (Booking booking: bookings){
        if((startDate.compareTo(booking.getStartDate()) >= 0
                && startDate.compareTo(booking.getEndingDate()) <= 0) ||
                (endDate.compareTo(booking.getStartDate()) >= 0
                && endDate.compareTo(booking.getEndingDate()) <= 0)){
          validBooking = false;
          break;
        }
    }

    }
    if(validBooking){
      bookings.add(new Booking(startDate, endDate));
      ((Client) App.getUser()).getMyBookings().add(this);
      System.out.println(this);
      long timeDiff = Math.abs(startDate.getTime() - endDate.getTime());
      long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
      int days = (int)daysDiff;
      totalPrice = days * price;
      PaymentMethods.mostrarOpciones(totalPrice);
    }
    else{
      System.out.println("The selected dates are not available");
      System.out.println("________");
    }
    showBookings();
  }

  public void deleteBooking(){
    while(true){
      try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the reservation you want to cancel");
        showBookings();
        if(bookings.size() == 0) break;
        System.out.println();
        int numberBooking = sc.nextInt();
        if(numberBooking < 0 || numberBooking >= bookings.size()) throw new Exception();
        bookings.set(numberBooking, null);
        bookings.removeIf(Objects::isNull);
        ((Client) App.getUser()).getMyBookings().remove(this);
        System.out.println(this);
        System.out.println("Booking have been canceled");

      } catch (Exception e){
        System.out.println("Invalid option");
      }

    }
  }


}
