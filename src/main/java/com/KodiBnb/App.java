package com.KodiBnb;

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

        System.out.println("app runing");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to log off");
        option = sc.nextInt();
        if(option == 0) user.logOff();
        }

    }
}
