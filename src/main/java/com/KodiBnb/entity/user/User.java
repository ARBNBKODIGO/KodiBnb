package com.KodiBnb.entity.user;

import com.KodiBnb.App;
import lombok.Getter;
import lombok.Setter;

public class User {

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

    public void logOff() {
        App.setUser(null);
        System.out.println("You have logged out");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
