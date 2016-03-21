package com.example.mashka.helloworld.music;


import com.example.mashka.helloworld.entity.Person;

import java.util.Date;
import java.sql.Time;

public class MusicList {
    private Person musicComposer;
    private Person musician;
    private String discName;
    private int tracksNumber;
    private Time tracksDuration;
    private User user;
    private Date buyDate;

    public MusicList(Person musicComposer, Person musician, String discName, int tracksNumber,
                     Time tracksDuration, User user, Date buyDate) {
        this.musicComposer = musicComposer;
        this.musician = musician;
        this.discName = discName;
        this.tracksNumber = tracksNumber;
        this.tracksDuration = tracksDuration;
        this.user = user;
        this.buyDate = buyDate;
    }

    public Person getMusicComposer() {
        return musicComposer;
    }

    public void setMusicComposer(Person musicComposer) {
        this.musicComposer = musicComposer;
    }

    public Person getMusician() {
        return musician;
    }

    public void setMusician(Person musician) {
        this.musician = musician;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public int getTracksNumber() {
        return tracksNumber;
    }

    public void setTracksNumber(int tracksNumber) {
        this.tracksNumber = tracksNumber;
    }

    public Time getTracksDuration() {
        return tracksDuration;
    }

    public void setTracksDuration(Time tracksDuration) {
        this.tracksDuration = tracksDuration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicList musicList = (MusicList) o;

        if (tracksNumber != musicList.tracksNumber) return false;
        if (!musicComposer.equals(musicList.musicComposer)) return false;
        if (!musician.equals(musicList.musician)) return false;
        if (!discName.equals(musicList.discName)) return false;
        if (!tracksDuration.equals(musicList.tracksDuration)) return false;
        if (!user.equals(musicList.user)) return false;
        return buyDate.equals(musicList.buyDate);

    }

    @Override
    public int hashCode() {
        int result = musicComposer.hashCode();
        result = 31 * result + musician.hashCode();
        result = 31 * result + discName.hashCode();
        result = 31 * result + tracksNumber;
        result = 31 * result + tracksDuration.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + buyDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MusicList{" +
                "musicComposer=" + musicComposer +
                ", musician=" + musician +
                ", discName='" + discName + '\'' +
                ", tracksNumber=" + tracksNumber +
                ", tracksDuration=" + tracksDuration +
                ", user=" + user +
                ", buyDate=" + buyDate +
                '}';
    }
}
