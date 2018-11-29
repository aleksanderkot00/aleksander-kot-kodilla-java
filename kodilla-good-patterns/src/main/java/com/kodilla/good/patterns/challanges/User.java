package com.kodilla.good.patterns.challanges;

public class User {

    private String name;
    private String lastName;
    private String address;
    private String phoneNumber;

    public User(String name, String lastName, String address, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
