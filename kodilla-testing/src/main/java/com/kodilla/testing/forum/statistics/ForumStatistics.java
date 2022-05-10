package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            postsPerUser = postsCount / (double)usersCount;
            commentsPerUser = commentsCount / (double)usersCount;
        }
        if (postsCount != 0) {
            commentsPerPosts = commentsCount / (double)postsCount;
        }
    }

    public String showStatistics() {
        return "usersCount = " + usersCount + ", postsCount = " + postsCount + ", commentsCount = " + commentsCount + ", postsPerUser = " + postsPerUser + ", commentsPerUser = " + commentsPerUser + ", commentsPerPosts = " + commentsPerPosts;
    }
}