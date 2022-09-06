package com.KodiBnb.entity.access;

import com.KodiBnb.App;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;
import com.KodiBnb.entity.user.User;

import java.util.Scanner;

public class Login {


    public static void singUp(){

        try{
            Scanner sc = new Scanner(System.in);
            String name;
            String email;
            String password;
            String celphone;
            int userType;
            System.out.println("Input your name");
            name = sc.nextLine();
            System.out.println("Input your email");
            email = sc.nextLine();
            System.out.println("Input your password");
            password = sc.nextLine();
            System.out.println("Input your celphone");
            celphone = sc.nextLine();
            System.out.println("What king of user do you want to be");
            System.out.println("""
                    Input 1 for be a Client 
                    Input 2 for be a Supplier""");
            userType = sc.nextInt();
            if(userType < 1 || userType > 2) throw new RuntimeException();

            if(userType == 1){
                App.addNewUser(new Client(name, email, password, celphone));
                App.runApp();
            }
            if(userType == 2){
                App.addNewUser(new Supplier(name, email, password, celphone));
                App.runApp();
            }

        }
        catch (Exception e){
            System.out.println("Please enter a valid data: " + e);
        }



    }


    public static void singIn(){
        boolean userFinded = false;
        Scanner sc = new Scanner(System.in);
        String email;
        String password;
        System.out.println("Input your email");
        email = sc.nextLine();
        System.out.println("Input your password");
        password = sc.nextLine();

        for (User user : App.getUsersList()) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                userFinded = true;
                App.setUser(user);
                App.runApp();
                break;
            }
        }

        if(!userFinded) System.out.println("wrong email or password");
    }


}
