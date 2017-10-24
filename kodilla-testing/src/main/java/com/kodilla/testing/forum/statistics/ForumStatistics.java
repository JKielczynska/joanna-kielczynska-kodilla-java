package com.kodilla.testing.forum.statistics;

/**Class presents the forum statistics.*/
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

    /**Calculates statistics based on forum data. */
    public void calculateAdvStatistics(final Statistics statistics) {
        storeBasicStats(statistics);
        calculateComplexStats();
    }

    private void storeBasicStats(final Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
    }

    private void calculateComplexStats() {
        if (numberOfUsers != 0) {
            avgPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
            avgCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        }

        if (numberOfPosts != 0) {
            avgCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    /**Prints the statistics of forum. */
    public void showStatistics() {
        System.out.printf("Number of Users: %d%n, Number od posts: %d%n, Number of comments: %d%n, " +
                        "Average number of posts per User: %.2f%n, Average number of comments per User: %.2f%n, " +
                        "Average number of comments per post: %.2f%n", numberOfUsers, numberOfPosts, numberOfComments,
                        avgPostsPerUser, avgCommentsPerUser, avgCommentsPerPost);
    }
}