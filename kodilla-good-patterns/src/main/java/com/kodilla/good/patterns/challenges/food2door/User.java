package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String nickName;
    private String name;
    private String surname;

    /**Method stores user's data.*/
    public User(final String nickName, final String name, final String surname) {
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return name + " " + surname + " (nickName: " + nickName + ")";
    }
}
