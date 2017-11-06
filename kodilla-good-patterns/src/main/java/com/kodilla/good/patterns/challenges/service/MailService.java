package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService {
    public void sendMessage(final User user) {
        System.out.println("Dear " + user.getName() + ",\nyou ordered product from our store.");
    }
}
