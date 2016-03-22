package com.example.mashka.helloworld.music;


public class User {

    private String userName;
    private MusicTrack likeTrack;

    public User(String userName, MusicTrack likeTrack) {
        this.userName = userName;
        this.likeTrack = likeTrack;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MusicTrack getLikeTrack() {
        return likeTrack;
    }

    public void setLikeTrack(MusicTrack likeTrack) {
        this.likeTrack = likeTrack;
    }
}
