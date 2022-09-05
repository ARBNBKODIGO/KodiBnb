package com.KodiBnb.entity.user;

import lombok.Getter;
import lombok.Setter;

public class User implements IUsers{

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String celphone;

    public User(String name, String email, String password, String celphone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.celphone = celphone;
    }

    @Override
    public void logOff() {
        System.out.println("You have logged out");
    }


}
