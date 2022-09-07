package com.KodiBnb;

import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;
import com.KodiBnb.entity.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static App app;

    private static User user;

    private static List<User> usersList = new ArrayList<User>();

    private App(){

    }

    public static App getApp() {
        if(app == null) app = new App();
        return app;
    }

    public static List<User> getUsersList()
    {
        return usersList;
    }

    public static void addNewUser(User user) {
        usersList.add(user);
        App.user = user;
    }

    public static void addOldUsers(User user){
        usersList.add(user);
    }

    public static User getUser() {
        return App.user;
    }

    public static void setUser(User user) {
        App.user = user;
    }

    public static void runApp(){
        int option;
        while (getUser() != null){
            System.out.println("Hi " + user );
            Scanner sc = new Scanner(System.in);
            System.out.println(user.getClass());
            try{
                if(user.getClass() == Supplier.class){
                    System.out.println("""
                            Please input:
                            0 - to log off
                            1 - Add a new property
                            2 - Delete a property                          
                            """);
                    option = sc.nextInt();
                    if(option == 0) user.logOff();
                    if(option == 1) ((Supplier) user).addNewProperty();
                    if(option == 2) ((Supplier) user).deletePropertyMenu();

                }
                if(user.getClass() == Client.class){
                    System.out.println("""
                            Please input:
                            0 - to log off
                            1 - Add a new reservation
                            2 - Cancel reservation                       
                            """);
                    option = sc.nextInt();
                    if(option == 0) user.logOff();
                }

            }
            catch (Exception e) {
                System.out.println("Please input a number" + e);
            }

        }
    }
}
