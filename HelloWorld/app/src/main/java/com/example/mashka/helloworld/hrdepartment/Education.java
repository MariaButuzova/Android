package com.example.mashka.helloworld.hrdepartment;


public class Education {
    private String schoolName;
    private int number;

    public Education(String schoolName, int number) {
        this.schoolName = schoolName;
        this.number = number;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Education education = (Education) o;

        if (number != education.number) return false;
        return schoolName.equals(education.schoolName);

    }

    @Override
    public int hashCode() {
        int result = schoolName.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Education{" +
                "schoolName='" + schoolName + '\'' +
                ", number=" + number +
                '}';
    }
}
