package com.kodilla.rps;

public class Rock implements Thing {

    public String getThingName() {
        return "Wybrałeś 1 - Kamień";
    }

    @Override
    public String toString() {
        return getThingName();
    }

}
