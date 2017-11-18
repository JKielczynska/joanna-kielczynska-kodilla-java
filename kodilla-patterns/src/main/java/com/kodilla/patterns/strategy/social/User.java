package com.kodilla.patterns.strategy.social;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(final String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialMedia(final SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
