package com.KodiBnb.entity.user;

import com.KodiBnb.entity.property.Property;
import java.util.ArrayList;
import java.util.List;

public class Supplier extends User {

  private List<Property> properties = new ArrayList<Property>();

  public Supplier(String name, String email, String password, String celphone) {
    super(name, email, password, celphone);
  }

  /*
     Propiedades : PROPIEDAD[]

  + Agregar propieadad(PROPIEDAD)

  + Eliminar propiedad(PROPIEDAD)
   */

  @Override
  public String toString() {
    return "Supplier{" +
            "name=" + getName() +
            "properties=" + properties +
            '}';
  }
}
