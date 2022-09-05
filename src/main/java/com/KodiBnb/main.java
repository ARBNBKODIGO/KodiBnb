package com.KodiBnb;

import com.KodiBnb.entity.access.Login;
import com.KodiBnb.utils.UsersPreregistered;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    int option;
    Scanner sc = new Scanner(System.in);
    App.getApp();
    UsersPreregistered.loadOldUsers();

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
          Login.singIn();
        }
        if(option == 2) {
          Login.singUp();
        }

      } catch (Exception e) {
        System.out.println("Please input a number: " + e);
        sc.nextLine();
      }
      //*/

    }
  }
}
