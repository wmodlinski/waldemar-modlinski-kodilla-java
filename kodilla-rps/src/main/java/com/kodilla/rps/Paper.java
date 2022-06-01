package com.kodilla.rps;

public class Paper implements Thing {

    public String getThingName() {
        return "Wybrałeś 2 - Papier";
    }

    @Override
    public String toString() {
        return getThingName();
    }

}
