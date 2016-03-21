package com.example.mashka.helloworld.entity;

import java.util.Date;

public class Person {
    private Date birthDay;
    private String firstName;
    /*public enum Gender {
        MALE, FEMALE, MIDDLE
    }*/

    public Person() {
        this.birthDay = new Date();
        this.firstName = new String();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!birthDay.equals(person.birthDay)) return false;
        return firstName.equals(person.firstName);

    }

    @Override
    public int hashCode() {
        int result = birthDay.hashCode();
        result = 31 * result + firstName.hashCode();
        return result;
    }
}
