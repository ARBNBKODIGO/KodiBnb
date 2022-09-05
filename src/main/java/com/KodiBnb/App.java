package com.KodiBnb;

import com.KodiBnb.entity.user.IUsers;
import com.KodiBnb.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static App app;

    private static User user;

    private static List<IUsers> usersList = new ArrayList<IUsers>();

    private App(){

    }

    public static App getApp() {
        if(app == null) app = new App();
        return app;
    }

    public static List<IUsers> getUsersList() {
        return usersList;
    }

    public static void addUser(User user) {
        usersList.add(user);
        App.user = user;
    }

    public static User getUser() {
        return App.user;
    }

    public static void runApp(){
        System.out.println(getUsersList());
    }
}
