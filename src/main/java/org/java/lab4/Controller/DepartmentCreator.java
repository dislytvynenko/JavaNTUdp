package org.java.lab4.Controller;

import org.java.lab4.Model.Department;
import org.java.lab4.Model.Group;
import org.java.lab4.Model.Human;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public void addGroup(Department department, Group group) {
        department.addGroup(group);
    }
}
