package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            avgPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
            avgCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        }

        if (numberOfPosts > 0) {
            avgCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of Users: " + numberOfUsers);
        System.out.println("Number od posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average nmber of posts per User: " + avgPostsPerUser);
        System.out.println("Average number of comments per User: " + avgCommentsPerUser);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
}
