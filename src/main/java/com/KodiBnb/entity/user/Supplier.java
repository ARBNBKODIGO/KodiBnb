package com.KodiBnb.entity.user;

import com.KodiBnb.App;
import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supplier extends User {

  private List<Property> properties = new ArrayList<Property>();

  public Supplier(String name, String email, String password, String celphone) {
    super(name, email, password, celphone);
  }

  public List<Property> getProperties() {
    return properties;
  }

  public void addOldProperty(Property property)
  {
    properties.add(property);
    Store.addOldPropertyStore(property);
  }

  public void addNewProperty(){
    Scanner sc = new Scanner(System.in);
    String address;
    Double cost;
    int capacity;
    System.out.println("Input property's address");
    address = sc.nextLine();
    System.out.println("Input property's cost");
    cost = sc.nextDouble();
    System.out.println("Input property's capacity");
    capacity = sc.nextInt();

    this.properties.add(new Property(address, cost, capacity));

  }

  public void deletePropertyMenu(){
    System.out.println("From the" + (properties.size()) + "properties above, please, write the number of the property to be deleted\n" +
            "You will need to pick a number from 1 to" + properties.size());
  }
  public void deleteProperty(int position){

    properties.remove(position);
  }

}
