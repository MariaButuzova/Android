package com.example.mashka.helloworld.music;


public class User {

    private String userName;
    private String likeTrack;

    public User(String userName, String likeTrack) {
        this.userName = userName;
        this.likeTrack = likeTrack;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLikeTrack() {
        return likeTrack;
    }

    public void setLikeTrack(String likeTrack) {
        this.likeTrack = likeTrack;
    }
}
