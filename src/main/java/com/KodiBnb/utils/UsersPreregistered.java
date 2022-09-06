package com.KodiBnb.utils;

import com.KodiBnb.App;
import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;

public class UsersPreregistered {

    public static void loadOldUsers(){

        Client client1 = new Client("jose", "jose@mail.com", "1234", "1111" );
        Supplier supplier1 = new Supplier("rodrigo", "rodrigo@mail.com", "4321", "2222" );
        supplier1.addOldProperty(new Property("Cra 32", 200,2));
        supplier1.addOldProperty(new Property("Cra 50", 500,4));


        App.addOldUsers(client1);
        App.addOldUsers(supplier1);



    }



}
