package com.KodiBnb.entity.property;

import com.KodiBnb.entity.booking.Booking;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Property {

  private List<Booking> bookings;
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
}
