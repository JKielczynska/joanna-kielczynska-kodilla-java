package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testNumberOfPostsIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
    }
    @Test
    public void testNumberOfPostsIsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
    }
    @Test
    public void testNumberOfCommentsIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
    }
    @Test
    public void testPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPosts = 100;
        int numberOfComments = 50;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertTrue(result < 1);
    }
    @Test
    public void testPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPosts = 100;
        int numberOfComments = 120;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertTrue(result > 1);
    }
    @Test
    public void testNumberOfUsersIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(users);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
    }
    @Test
    public void testNumberOfUsersIsHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i < 100; i++) {
            users.add("user no" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());

    }
}
