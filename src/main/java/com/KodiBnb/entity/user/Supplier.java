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

  public void deletePropertyMenu(){
    try {
      if(properties.size() == 0){
        System.out.println("No properties available");
      } else if (properties.size() >= 1){
        getProperties();
        Scanner scanner = new Scanner(System.in);
        String repeat;
        int position;
        System.out.println("From the " + (properties.size()) + " properties above, please, write the number of the property to be deleted\n" +
                "You will need to pick a number between 1 and " + properties.size() + " being 1 the first on the list");
        position = scanner.nextInt();
        setPropertyNull(position);
        deleteProperty();
        Store.deletePropertyStore();
        System.out.printf("Property deleted");
        getProperties();
        System.out.println("Would you like to delete another property? Y/N");
        repeat = scanner.nextLine();
        if(repeat == "Y"){
          deletePropertyMenu();
        } else if (repeat == "N"){
          System.out.println("Session Ended");
        } else {
          System.out.println("Please enter a valid response");
        }
      }
    } catch (Exception e){
      System.out.println("Please Enter a valid option" + e);
    }
  }
  public void setPropertyNull(int position){
    properties.set(position, null);
  }

  public void deleteProperty(){
    for (int i = 0; i < properties.size(); i++) {
      if(properties.get(i) == null){
        properties.remove(i);
      }
    }
  }

  @Override
  public String toString() {
    return "Supplier{" +
            "name= " + getName() +
            "email= " + getEmail() +
            '}';
  }
}
