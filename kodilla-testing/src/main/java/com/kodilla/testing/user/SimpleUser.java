package com.kodilla.testing.user;

/**Class represents user's name.*/
public class SimpleUser {
    private final String username;

    public SimpleUser(final String username) {
        this.username = username;
    }

    /**Returns user's name.*/
    public String getUsername() {
        return this.username;
    }
}
