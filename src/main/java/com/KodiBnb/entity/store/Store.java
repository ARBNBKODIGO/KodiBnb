package com.KodiBnb.entity.store;

import com.KodiBnb.entity.property.Property;
import java.util.ArrayList;
import java.util.List;

public class Store {

  private Property[] properties;

  public Property[] getProperties() {
    return properties;
  }

  public void setProperties(Property[] properties) {
    this.properties = properties;
  }

  // Methods
  private List<Property> filter() {
    List<Property> result = new ArrayList<Property>();
    return result;
  }
}
