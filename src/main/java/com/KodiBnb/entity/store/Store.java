package com.KodiBnb.entity.store;

import com.KodiBnb.App;
import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.user.Client;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
  @Getter  @Setter
  private static List<Property> propertiesList = new ArrayList<Property>();

  private List<Property> filter() {
    List<Property> result = new ArrayList<Property>();
    return result;
  }

  public static void addPropertyStore(Property property){
    propertiesList.add(property);
  }


  public static void showPropertyList(){
    System.out.println("Select the number of the property you want: ");
    for(int i = 0; i < propertiesList.size(); i++){
      System.out.println(i + " - " + propertiesList.get(i));
    }
  }

  public static void setBooking() throws ParseException {
    showPropertyList();
    Scanner sc = new Scanner(System.in);
    try {
      int propertyNumber = sc.nextInt();
      if(propertyNumber < 0 || propertyNumber >= propertiesList.size()) throw new Exception();
      ((Client) App.getUser()).makeBooking(propertiesList.get(propertyNumber));
    }
    catch (Exception e){
      System.out.println("Input a valid option" + e);
    }

  }


}
