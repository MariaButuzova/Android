package com.example.mashka.helloworld.entity;


import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private ArrayList<Person> actors;
    private Person[] directors;
    private String genre;
    private String movieName;

    public Movie() {
        this.movieName = new String();
        this.actors = new ArrayList();
        this.directors = new Person[10];
        this.genre = new String();
    }

    public void addActor(Person person) {
        if (!actors.contains(person)) {
            actors.add(person);
        }
    }

    public  void addDirector(Person person) {
        if (!isExisting(directors, person)) {
            directors[9] = person;
        }
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

    public Person[] getDirectors() {
        return directors;
    }

    public void setDirectors(Person[] directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    private boolean isExisting(Person[] persons, Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].equals(person)) {
                return true;
            }
        }
        return false;
    }
}
