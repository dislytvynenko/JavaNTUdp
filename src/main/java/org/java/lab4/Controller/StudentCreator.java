package org.java.lab4.Controller;

import org.java.lab4.Model.Human;
import org.java.lab4.Model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Human.Sex sex, String studentId) {
        return new Student(firstName, lastName, patronymic, sex, studentId);
    }
}
