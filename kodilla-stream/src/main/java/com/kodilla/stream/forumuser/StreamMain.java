package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, Object> theResultForum = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getBorn().isBefore(LocalDate.of(2002, 5, 17)))
                .filter(forumUser -> forumUser.getPublicatedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserUniqueNumber, forumUser -> forumUser));

        System.out.println("# Elements :" + theResultForum.size());
        theResultForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}