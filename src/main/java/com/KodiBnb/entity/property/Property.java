package com.KodiBnb.entity.property;

import com.KodiBnb.entity.booking.Booking;
import lombok.Getter;
import lombok.Setter;

public class Property {

  private Booking[] bookings;
  @Getter @Setter private String address;
  @Getter @Setter private double cost;
  @Getter @Setter private int capacity;

  public Property(String address, double cost, int capacity) {
    this.address = address;
    this.cost = cost;
    this.capacity = capacity;
  }


}
