package com.KodiBnb.entity.property;

import com.KodiBnb.entity.booking.Booking;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    try {
      for (Booking booking: bookings
      ) {
        System.out.println(booking);
      }
    }
    catch (Exception e){
      System.out.println("There is not active bookings in the property");
    }

  }

  public void validateBooking(Date startDate, Date endDate){
    boolean validBooking = true;
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
      addBooking(new Booking(startDate, endDate));
      showBookings();
    }
    else System.out.println("The selected dates are not available");
    showBookings();
  }

  public void addBooking(Booking booking){
    bookings.add(booking);
  }
}
