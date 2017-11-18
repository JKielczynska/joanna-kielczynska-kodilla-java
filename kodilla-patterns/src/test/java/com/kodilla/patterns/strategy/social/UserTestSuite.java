package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User charles = new YGeneration("Charles Brown");
        User mary = new ZGeneration("Mary Jones");
        //When
        String johnPostedOn = john.sharePost();
        System.out.println("John shared post on " + johnPostedOn);
        String charlesPostedOn = charles.sharePost();
        System.out.println("Charles shared post on " + charlesPostedOn);
        String maryPostedOn = mary.sharePost();
        System.out.println("Mary shared post on " + maryPostedOn);
        //Then
        Assert.assertEquals("Facebook", johnPostedOn);
        Assert.assertEquals("Twitter", charlesPostedOn);
        Assert.assertEquals("Snapchat", maryPostedOn);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");
        //When
        String johnPostedOn = john.sharePost();
        System.out.println("John shared post on " + johnPostedOn);
        john.setSocialMedia(new TwitterPublisher());
        johnPostedOn = john.sharePost();
        System.out.println("Now John posts on " + johnPostedOn);
        //Then
        Assert.assertEquals("Twitter", johnPostedOn);
    }
}
