package com.kodilla.testing.forum.statistics;

public class ForumStatisticsCalculator {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        postsPerUser = postsNumber / (double) usersNumber;
        commentsPerUser = commentsNumber / (double) usersNumber;
        commentsPerPost = commentsNumber / (double) postsNumber;
    }

    public void showStatistics() {
        System.out.println("Users number: " + usersNumber + "; Posts Number: " + postsNumber + "; Comments Number " + commentsNumber + "; Posts per user: " + postsPerUser + "; Comments per user: " + commentsPerUser + "; Comments per post: " + commentsPerPost);
    }
}
