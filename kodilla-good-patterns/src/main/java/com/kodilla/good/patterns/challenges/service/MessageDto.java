package com.kodilla.good.patterns.challenges.service;

public class MessageDto {
    private User user;
    private String message;

    public MessageDto(final User user, final String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
