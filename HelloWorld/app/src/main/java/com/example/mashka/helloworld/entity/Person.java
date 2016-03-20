package com.example.mashka.helloworld.entity;

import java.util.Date;

public class Person {
    private Date birthDay;
    private String name;

    public Person(Date birthDay, String name) {
        this.birthDay = birthDay;
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!birthDay.equals(person.birthDay)) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = birthDay.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
