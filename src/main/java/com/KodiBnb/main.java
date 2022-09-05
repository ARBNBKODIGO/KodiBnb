package com.KodiBnb;

import com.KodiBnb.entity.access.Login;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    int option;
    Scanner sc = new Scanner(System.in);

    while(true) {
      try {

        System.out.println(
        """
        Welcome to KodiBnb press the number depends of what you want to do?:
        0- Finish program
        1- SingIn
        2- SingUp
        """);
        System.out.print("Select the option: ");
        option = sc.nextInt();

        if(option < 0 || option > 2) {
          sc.nextLine();
          System.out.println("Please input a valid option");}
        if(option == 0) break;
        if(option == 1) {
          String email;
          String password;
          sc.nextLine();
          System.out.println("Input your email");
          email = sc.nextLine();
          System.out.println("Input your password");
          password = sc.nextLine();
          Login.singIn(email,password);
        }
        if(option == 2) {
          try{
            String name;
            String email;
            String password;
            String celphone;
            int userType;
            sc.nextLine();
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
            if(userType >= 1 && userType <= 2) Login.singUp(name,email,password,celphone, userType);
            else throw new RuntimeException();
          }
          catch (Exception e){
            System.out.println("Please enter a valid data: " + e);
          }
        }

      } catch (Exception e) {
        System.out.println("Please input a number: " + e);
        sc.nextLine();
      }
      //*/

    }
  }
}
