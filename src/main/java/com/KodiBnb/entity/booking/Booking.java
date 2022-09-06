package com.KodiBnb.entity.booking;

import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class Booking {

  @Getter @Setter private Date startDate;
  @Getter @Setter private Date endingDate;

  public Booking(Date startDate, Date endingDate) {
    this.startDate = startDate;
    this.endingDate = endingDate;
  }

  @Override
  public String toString() {
    return "Booking{" +
            "startDate=" + startDate +
            ", endingDate=" + endingDate +
            '}';
  }
}
