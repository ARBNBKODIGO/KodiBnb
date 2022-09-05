package com.KodiBnb.entity.property;

import com.KodiBnb.entity.access.booking.Booking;
import lombok.Getter;
import lombok.Setter;

public class Property {

  private Booking[] bookings;
  @Getter @Setter private String address;
  @Getter @Setter private double cost;
  @Getter @Setter private int capacity;
  @Getter @Setter private boolean availability;

  public Booking[] getBookings() {
    return bookings;
  }

  public void setBookings(Booking[] bookings) {
    this.bookings = bookings;
  }
}
