package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCommentsPerPost0Posts() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(16 / (double) 0, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUser0Posts() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(0 / (double) 5, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUser0Posts() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals(16 / (double) 5, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPost1000Posts() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(16 / (double) 1000, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUser1000Posts() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(1000 / (double) 5, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUser1000Posts() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals(16 / (double) 5, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPost0Comments() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(0 / (double) 1000, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUser0Comments() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(1000 / (double) 5, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUser0Comments() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals(0 / (double) 5, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPostLessCommentsThanPosts() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(14 / (double) 23, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUserLessCommentsThanPosts() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(23 / (double) 5, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUserLessCommentsThanPosts() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals( 14 / (double) 5, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPostGreaterCommentsThanPosts() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(54 / (double) 7, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUserGreaterCommentsThanPosts() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(7 / (double) 5, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUserGreaterCommentsThanPosts() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals( 54 / (double) 5, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPost0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(13);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(16 / (double) 13, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUser0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(13);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(13 / (double) 0, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUser0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(16);
        when(statisticsMock.postsCount()).thenReturn(13);

        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator();
        calculator.calculateAdvStatistics(statisticsMock);
        //When
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals(16 / (double) 0, commentsPerUser,0.000001);
    }

    @Test
    public void testCommentsPerPost100Users() {
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
        double commentsPerPost = calculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(16 / (double) 13, commentsPerPost,0.000001);
    }

    @Test
    public void testPostPerUser100Users() {
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
        double postPerUser = calculator.getPostsPerUser();
        //Then
        Assert.assertEquals(13 / (double) 100, postPerUser,0.000001);
    }

    @Test
    public void testCommentsPerUser100Users() {
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
        double commentsPerUser = calculator.getCommentsPerUser();
        //Then
        Assert.assertEquals(16 / (double) 100, commentsPerUser,0.000001);
    }
}
