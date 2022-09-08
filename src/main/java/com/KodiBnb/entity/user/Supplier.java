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
    Store.addPropertyStore(property);
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
    Property newProperty = new Property(address,cost,capacity);
    properties.add(newProperty);
    Store.addPropertyStore(newProperty);
  }

  public void deleteProperty(){
    System.out.println("elimar");
  }

  @Override
  public String toString() {
    return "Supplier{" +
            "name= " + getName() +
            "email= " + getEmail() +
            '}';
  }
}
