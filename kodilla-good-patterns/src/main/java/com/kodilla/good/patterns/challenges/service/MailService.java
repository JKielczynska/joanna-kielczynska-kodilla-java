package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService {
    public void sendMessage(final MessageDto messageDto) {
        System.out.println("Message: " + messageDto.getMessage() + " to " + messageDto.getUser());
    }
}
