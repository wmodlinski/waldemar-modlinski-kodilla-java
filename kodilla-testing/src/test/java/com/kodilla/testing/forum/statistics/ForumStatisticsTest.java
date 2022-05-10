package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ForumStatisticsTest {
    public static int number = 1;
    public static int number1 = 1;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start testing.");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test nr. " + number + " start.");
        number++;
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test nr. " + number1 + " stop.");
        number1++;
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Last test finished");
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsWhenQuantityPostsAre0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 0, commentsCount = 0, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.0", forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityPostsAre1000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 1000, commentsCount = 0, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.0", forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStaticsWhenQuantityCommentsAre0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 0, commentsCount = 0, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.0", forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityCommentsMoreThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 1, commentsCount = 2, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 2.0", forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityCommentsLessThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(2);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 2, commentsCount = 1, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.5", forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityUsersAre0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> names = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(names);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 0, postsCount = 0, commentsCount = 0, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.0", forumStatistics.showStatistics());
    }

    private static List<String> listOfUsers(int quantity) {
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            names.add("User" + i);
        }
        return names;
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityUsersAre100() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> names = new ArrayList<>(listOfUsers(100));
        when(statisticsMock.usersNames()).thenReturn(names);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("usersCount = 100, postsCount = 0, commentsCount = 0, postsPerUser = 0.0, commentsPerUser = 0.0, commentsPerPosts = 0.0", forumStatistics.showStatistics());
    }
}