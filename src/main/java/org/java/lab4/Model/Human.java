package org.java.lab4.Model;

import java.util.Objects;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.patronymic + " (" + this.sex + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(patronymic, human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, sex);
    }

    public enum Sex {
        MALE,
        FEMALE
    }
}
