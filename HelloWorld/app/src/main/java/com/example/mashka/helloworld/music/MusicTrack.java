package com.example.mashka.helloworld.music;

import java.sql.Time;

import com.example.mashka.helloworld.entity.Person;

public class MusicTrack {
    private String songName;
    private Person trackComposer;
    private Person trackMusician;
    private Time trackDuration;

    public MusicTrack(String songName, Person trackComposer, Person trackMusician, Time trackDuration) {
        this.songName = songName;
        this.trackComposer = trackComposer;
        this.trackMusician = trackMusician;
        this.trackDuration = trackDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Person getTrackComposer() {
        return trackComposer;
    }

    public void setTrackComposer(Person trackComposer) {
        this.trackComposer = trackComposer;
    }

    public Person getTrackMusician() {
        return trackMusician;
    }

    public void setTrackMusician(Person trackMusician) {
        this.trackMusician = trackMusician;
    }

    public Time getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(Time trackDuration) {
        this.trackDuration = trackDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicTrack that = (MusicTrack) o;

        if (!songName.equals(that.songName)) return false;
        if (!trackComposer.equals(that.trackComposer)) return false;
        if (!trackMusician.equals(that.trackMusician)) return false;
        return trackDuration.equals(that.trackDuration);

    }

    @Override
    public int hashCode() {
        int result = songName.hashCode();
        result = 31 * result + trackComposer.hashCode();
        result = 31 * result + trackMusician.hashCode();
        result = 31 * result + trackDuration.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MusicTrack{" +
                "songName='" + songName + '\'' +
                ", trackComposer=" + trackComposer +
                ", trackMusician=" + trackMusician +
                ", trackDuration=" + trackDuration +
                '}';
    }
}
