package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private int userId;
    private String userName;
    private char sex;
    private LocalDate birthdate;
    private int postsNumber;

    public ForumUser(int userId, String userName, char sex, LocalDate birthdate, int postsNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthdate = birthdate;
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postsNumber=" + postsNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                sex == forumUser.sex &&
                postsNumber == forumUser.postsNumber &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(birthdate, forumUser.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, sex, birthdate, postsNumber);
    }
}
