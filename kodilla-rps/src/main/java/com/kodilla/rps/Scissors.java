package com.kodilla.rps;

public class Scissors implements Thing {

    public String getThingName() {
        return "Wybrałeś 3 - Nożyczki!";
    }

    @Override
    public String toString() {
        return getThingName();
    }

}
