package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames();
    int usersCount();
    int postsCount();
    int commentsCount();
    double postsPerUser();
    double commentsPerUser();
    double commentsPerPosts();
}