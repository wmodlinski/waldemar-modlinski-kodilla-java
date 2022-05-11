package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
        assertEquals(4, forumStatistics.getUsersCount(), 4);
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(3, forumStatistics.getCommentsCount(), 3);
        assertEquals(0, forumStatistics.getPostsPerUser(), 0);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0);
        assertEquals(0, forumStatistics.getCommentsPerPosts(),0);
    }

    @Test
    void testCalculateAdvStatisticsWhenQuantityPostsAre1000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getUsersCount(), 4);
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(10, forumStatistics.getCommentsCount(), 10);
        assertEquals(250, forumStatistics.getPostsPerUser(), 250);
        assertEquals(0.75, forumStatistics.getCommentsPerUser(), 0.75);
        assertEquals(100, forumStatistics.getCommentsPerPosts(),100);
    }

    @Test
    void testCalculateAdvStaticsWhenQuantityCommentsAre0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getUsersCount(), 4);
        assertEquals(0, forumStatistics.getPostsCount(),0);
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0);
        assertEquals(0.75, forumStatistics.getCommentsPerUser(), 0.75);
        assertEquals(0, forumStatistics.getCommentsPerPosts(),0);
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
        assertEquals(4, forumStatistics.getUsersCount(), 4);
        assertEquals(2, forumStatistics.getPostsCount());
        assertEquals(10, forumStatistics.getCommentsCount());
        assertEquals(0.5, forumStatistics.getPostsPerUser(), 0.5);
        assertEquals(2.5, forumStatistics.getCommentsPerUser(), 2.5);
        assertEquals(5, forumStatistics.getCommentsPerPosts());
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
        assertEquals(4, forumStatistics.getUsersCount(), 4);
        assertEquals(10, forumStatistics.getPostsCount());
        assertEquals(2, forumStatistics.getCommentsCount());
        assertEquals(2.5, forumStatistics.getPostsPerUser(), 2.5);
        assertEquals(0.5, forumStatistics.getCommentsPerUser(), 0.5);
        assertEquals(0.2, forumStatistics.getCommentsPerPosts());
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
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPosts());
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
        assertEquals(50, forumStatistics.getPostsCount(), 50);
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0.5, forumStatistics.getPostsPerUser(), 0.5);
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPosts());
    }
}