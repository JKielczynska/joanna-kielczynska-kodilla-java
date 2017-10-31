package com.kodilla.exception.nullpointer;

public final class User {
    private String name;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
