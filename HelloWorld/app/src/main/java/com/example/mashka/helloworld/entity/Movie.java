package com.example.mashka.helloworld.entity;


public class Movie {
    private Person[] actors;
    private Person[] directors;
    private String genre;

    public Movie() {
        this.actors = new Person[10];
        this.directors = new Person[10];
        this.genre = new String();
    }


    public Person[] getDirectors() {
        return directors;
    }

    public void setDirectors(Person[] directors) {
        this.directors = directors;
    }

    public Person[] getActors() {
        return actors;
    }

    public void setActors(Person[] actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
