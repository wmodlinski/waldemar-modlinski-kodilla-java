package com.kodilla.good.patterns.challenges.onlineshop;

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String address;

    public User(String userName, String firstName, String lastName, String address) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Użytkownik { " +
                "Nazwa użytkownika= '" + userName + '\'' +
                ", Imię= '" + firstName + '\'' +
                ", Nazwisko= '" + lastName + '\'' +
                ", Adres do wysyłki= '" + address + '\'' +
                '}';
    }
}
