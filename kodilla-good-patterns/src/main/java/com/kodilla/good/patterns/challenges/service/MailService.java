package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService {
    public void sendMessage(final User user, final Product product) {
        System.out.println("Dear " + user.getName() + ",\nyou bought " + product + " from our store.\nThank you for your order.");
    }
}
