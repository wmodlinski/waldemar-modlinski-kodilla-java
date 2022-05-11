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
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0);
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityPostsAre1000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(1000, forumStatistics.getPostsPerUser(), 1000);
    }

    @Test
    void testCalculateAdvStaticsWhenQuantityCommentsAre0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getCommentsPerPosts(), 0);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0);

    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityCommentsMoreThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2, forumStatistics.getPostsCount());
        assertEquals(10, forumStatistics.getCommentsCount());
        assertEquals(2, forumStatistics.getPostsPerUser(), 2);
        assertEquals(10, forumStatistics.getCommentsPerUser(), 10);
        assertEquals(5, forumStatistics.getCommentsPerPosts(), 5);

    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityCommentsLessThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPostsCount());
        assertEquals(2, forumStatistics.getCommentsCount());
        assertEquals(10, forumStatistics.getPostsPerUser(), 10);
        assertEquals(0.2, forumStatistics.getCommentsPerUser(), 0.2);
        assertEquals(0.2, forumStatistics.getCommentsPerPosts(), 0.2);
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
        assertEquals(0, forumStatistics.getUsersCount());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0);

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
        assertEquals(100, forumStatistics.getUsersCount());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0.0);
        assertEquals(0.0, forumStatistics.getCommentsPerUser(), 0.0);
    }
}