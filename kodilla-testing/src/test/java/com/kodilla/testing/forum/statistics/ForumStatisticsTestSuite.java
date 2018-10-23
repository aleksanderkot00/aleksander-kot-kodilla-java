package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            users.add("User1");
            users.add("User2");
            users.add("User3");
            users.add("User4");
            users.add("User5");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(5, 0, 16, 0 / 5.0, 16 / 5.0, 0.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        users.add("User3");
        users.add("User4");
        users.add("User5");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(5, 1000, 16, 1000 / 5.0, 16 / 5.0, 16 / 1000.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        users.add("User3");
        users.add("User4");
        users.add("User5");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(5, 1000, 0, 1000 / 5.0, 0 / 5.0, 0 / 1000.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        users.add("User3");
        users.add("User4");
        users.add("User5");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(14);
        when(statisticsMock.postsCount()).thenReturn(23);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(5, 23, 14, 23 / 5.0, 14 / 5.0, 14 / 23.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatisticsGreaterCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        users.add("User3");
        users.add("User4");
        users.add("User5");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(54);
        when(statisticsMock.postsCount()).thenReturn(7);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(5, 7, 54, 7 / 5.0, 54 / 5.0, 54 / 7.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(13);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(0, 13, 16, 0.0, 0.0, 16 / 13.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User" + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(13);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        ForumStatisticsCalculator expectedCalculator = new ForumStatisticsCalculator(100, 13, 16, 13 / 100.0, 16 / 100.0, 16 / 13.0);
        //Then
        Assert.assertEquals(expectedCalculator, calculator);
    }
}
