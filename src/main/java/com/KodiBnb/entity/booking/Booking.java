package com.KodiBnb.entity.booking;

import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Booking {

  @Getter @Setter
  private Property propiedad;
  @Getter @Setter
  private Date startDate;
  @Getter @Setter
  private Date endingDate;
  @Getter @Setter
  private Client client;
  @Getter @Setter
  private Supplier supplier;

  private void accept() {}

  private void decline() {}

}
