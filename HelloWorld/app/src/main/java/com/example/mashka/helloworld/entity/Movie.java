package com.example.mashka.helloworld.entity;


import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private ArrayList<Person> actors;
    private ArrayList<Person> directors;
    private String genre;
    private String movieName;

    public Movie() {
        this.movieName = new String();
        this.actors = new ArrayList();
        this.directors = new ArrayList();
        this.genre = new String();
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String name) {
        this.movieName = name;
    }

    public ArrayList<Person> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Person> actors) {
        this.actors = actors;
    }

    public ArrayList<Person> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<Person> directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addActor(Person person) {
        if (!actors.contains(person)) {
            actors.add(person);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actors=" + actors +
                ", directors=" + directors +
                ", genre='" + genre + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }

    private boolean isExisting(ArrayList<Person> persons, Person person) {
        persons.contains(person);
        return false;
    }
}
