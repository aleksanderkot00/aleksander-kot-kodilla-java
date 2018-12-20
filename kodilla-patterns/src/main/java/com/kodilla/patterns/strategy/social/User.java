package com.kodilla.patterns.strategy.social;

public class User {

    final private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String shareOnSocialMedia() {
        return socialPublisher.share();
    }

    public String getUsername() {
        return username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
