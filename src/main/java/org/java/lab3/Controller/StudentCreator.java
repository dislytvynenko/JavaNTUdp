package org.java.lab3.Controller;

import org.java.lab3.Model.*;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Human.Sex sex, String studentId) {
        return new Student(firstName, lastName, patronymic, sex, studentId);
    }
}
