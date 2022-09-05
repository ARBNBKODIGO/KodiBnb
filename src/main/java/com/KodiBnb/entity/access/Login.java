package com.KodiBnb.entity.access;

import com.KodiBnb.App;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;
import com.KodiBnb.entity.user.User;

public class Login {

    public static void singUp(String name, String email, String password, String celphone, int userType){
        System.out.println("you have registered");
        if(userType == 1){
            App.getApp();
            App.addUser(new Client(name, email, password, celphone));
            App.runApp();
        }
        if(userType == 2){
            App.getApp();
            App.addUser(new Supplier(name, email, password, celphone));
            App.runApp();
        }

    }


    public static void singIn(String email, String password){
        System.out.println("you have logged in");
    }


}
