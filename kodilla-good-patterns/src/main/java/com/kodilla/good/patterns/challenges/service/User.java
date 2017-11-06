package com.kodilla.good.patterns.challenges.service;

public class User {
    private String nickName;
    private String name;
    private String surname;
    private String address;

    /**Method stores user's data.*/
    public User(final String nickName, final String name, final String surname, final String address) {
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}