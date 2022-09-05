package com.KodiBnb.utils;

import com.KodiBnb.App;
import com.KodiBnb.entity.user.Supplier;

public class UsersPreregistered {

    public static void loadOldUsers(){

        App.addOldUsers(new Supplier("jose", "jose@mail.com", "1234", "1111" ));
        App.addOldUsers(new Supplier("rodrigo", "rodrigo@mail.com", "4321", "2222" ));
    }


}
