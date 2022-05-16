package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userUniqueNumber;
    private final String username;
    private final char sex;
    private final LocalDate born;
    private final int publicatedPosts;

    public ForumUser(final int userUniqueNumber, final String username, final char sex, final int yearofBirth, final int monthOfBirth, final int dayOfBirth, int publicatedPosts) {
        this.userUniqueNumber = userUniqueNumber;
        this.username = username;
        this.sex = sex;
        this.born = LocalDate.of(yearofBirth, monthOfBirth, dayOfBirth);
        this.publicatedPosts = publicatedPosts;
    }

    public int getUserUniqueNumber() {
        return userUniqueNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getPublicatedPosts() {
        return publicatedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userUniqueNumber=" + userUniqueNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", born=" + born +
                ", publicatedPosts=" + publicatedPosts +
                '}';
    }
}