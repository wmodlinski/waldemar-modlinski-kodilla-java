package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Zdzisław", 'm', 2001, 12, 10, 15));
        forumUsersList.add(new ForumUser(2, "MonikaX", 'f', 1998, 10, 13, 12));
        forumUsersList.add(new ForumUser(3, "Darryl", 'm', 1998, 11, 12, 10));
        forumUsersList.add(new ForumUser(4, "Mistrzunio", 'm', 2005, 10, 1, 15));
        forumUsersList.add(new ForumUser(5, "Vova", 'm', 1965, 2, 3, 1352));
        forumUsersList.add(new ForumUser(6, "Shakira", 'f', 1996, 2, 13, 1526));
        forumUsersList.add(new ForumUser(7, "Bucik", 'm', 2005, 6, 10, 125));
        forumUsersList.add(new ForumUser(8, "Waldi Yetao", 'm', 1989, 5, 24, 0));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }
}