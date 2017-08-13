package com.example.mansi.puneguide;

/**
 * Created by Mansi on 26-07-2017.
 */

public class Emergency {
    String name=null;
    String number=null;

    public Emergency(String area, String phone_number) {
        name = area;
        number = phone_number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}
