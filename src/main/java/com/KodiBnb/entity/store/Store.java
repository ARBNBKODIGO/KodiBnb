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


  public void showPropertyList(){
    System.out.println("Select the property you want: ");
    for(int i = 0; i < propertiesList.size(); i++){
      System.out.println(i + " - " + propertiesList.get(i));
    }
  }




}
