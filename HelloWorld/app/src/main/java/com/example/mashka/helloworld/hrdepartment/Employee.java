package com.example.mashka.helloworld.hrdepartment;

import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private enum gender {
        MALE, FEMALE, MIDDLE
    }
    private Date birthDate;
    private Education[] education;
    private Date enrollmentDate;
    private String homeAddress;

    public Employee() {
        this.firstName = new String();
        this.lastName = new String();
        this.patronymic = new String();
        this.birthDate = new Date();
        this.education = new Education[3];
        this.enrollmentDate = new Date();
        this.homeAddress = new String();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Education[] getEducation() {
        return education;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
