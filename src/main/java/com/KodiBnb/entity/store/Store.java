package com.KodiBnb.entity.store;

import com.KodiBnb.entity.property.Property;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

public class Store {
  @Getter  @Setter
  private static List<Property> propertiesList;

  private List<Property> filter() {
    List<Property> result = new ArrayList<Property>();
    return result;
  }

  public static void addPropertyStore(Property property){
    propertiesList.add(property);
  }




}
