package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPosts() {
        return commentsPerPosts;
    }

    private double calculatePostsAvgPerUser() {

        if(usersCount>0){
            return (double)postsCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(usersCount>0){
            return (double)commentsCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(postsCount>0){
            return (double)commentsCount/postsCount;
        } else {
            return 0;
        }
    }


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