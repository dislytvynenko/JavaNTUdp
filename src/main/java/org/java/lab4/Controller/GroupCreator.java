package org.java.lab4.Controller;

import org.java.lab4.Model.Group;
import org.java.lab4.Model.Human;
import org.java.lab4.Model.Student;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public void addStudent(Group group, Student student) {
        group.addStudent(student);
    }
}
