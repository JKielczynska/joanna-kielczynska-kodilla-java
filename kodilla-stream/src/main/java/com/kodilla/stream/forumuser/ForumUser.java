package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    /**Constructor represents forum user with his ID, user name, sex, date of birth and number of published posts.*/
    public ForumUser(final int userId, final String username, final char sex, final LocalDate dateOfBirth, final int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
