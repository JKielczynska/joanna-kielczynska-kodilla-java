package com.kodilla.testing.forum.statistics;

/**Class presents the forum statistics.*/
public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    /**Returns number of forum users. */
    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    /**Returns number of forum posts. */
    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    /**Returns number of forum comments. */
    public int getNumberOfComments() {
        return numberOfComments;
    }

    /**Returns average number posts per forum user. */
    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    /**Returns average number comments per forum user. */
    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    /**Returns average number comments per post in forum. */
    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    /**Calculates statistics based on forum data. */
    public void calculateAdvStatistics(final Statistics statistics) {
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

    /**Prints the statistics of forum. */
    public void showStatistics() {
        System.out.println("Number of Users: " + numberOfUsers);
        System.out.println("Number od posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average nmber of posts per User: " + avgPostsPerUser);
        System.out.println("Average number of comments per User: " + avgCommentsPerUser);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
}
