package com.kodilla.testing.forum.statistics;

import java.util.Objects;

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

    public ForumStatisticsCalculator(int usersNumber, int postsNumber, int commentsNumber, double postsPerUser, double commentsPerUser, double commentsPerPost) {
        this.usersNumber = usersNumber;
        this.postsNumber = postsNumber;
        this.commentsNumber = commentsNumber;
        this.postsPerUser = postsPerUser;
        this.commentsPerUser = commentsPerUser;
        this.commentsPerPost = commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if (usersNumber == 0) {
            postsPerUser = 0;
            commentsPerUser = 0;
        } else {
            postsPerUser = postsNumber / (double) usersNumber;
            commentsPerUser = commentsNumber / (double) usersNumber;
        }
        if (postsNumber == 0) {
            commentsPerPost = 0;
        } else {
            commentsPerPost = commentsNumber / (double) postsNumber;
        }
    }

    public void showStatistics() {
        System.out.println("Users number: " + usersNumber + "; Posts Number: " + postsNumber + "; Comments Number " + commentsNumber + "; Posts per user: " + postsPerUser + "; Comments per user: " + commentsPerUser + "; Comments per post: " + commentsPerPost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumStatisticsCalculator that = (ForumStatisticsCalculator) o;
        return usersNumber == that.usersNumber &&
                postsNumber == that.postsNumber &&
                commentsNumber == that.commentsNumber &&
                Double.compare(that.postsPerUser, postsPerUser) == 0 &&
                Double.compare(that.commentsPerUser, commentsPerUser) == 0 &&
                Double.compare(that.commentsPerPost, commentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersNumber, postsNumber, commentsNumber, postsPerUser, commentsPerUser, commentsPerPost);
    }
}
