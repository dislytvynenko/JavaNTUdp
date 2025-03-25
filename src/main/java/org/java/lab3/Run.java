package org.java.lab3;

import org.java.lab3.Controller.*;
import org.java.lab3.Model.*;

public class Run {
    public static void createTypicalUniversity() {
        // Створення університету
        Human rector = new Human("Олександр", "Іваненко", "Васильович", Human.Sex.MALE) {};
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Національний технічний університет", rector);

        // Створення першого факультету
        Human facultyHead1 = new Human("Ірина", "Мельник", "Олександрівна", Human.Sex.FEMALE) {};
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty1 = facultyCreator.createFaculty("Факультет інформаційних технологій", facultyHead1);

        // Додавання кафедр до факультету
        Human departmentHead1 = new Human("Володимир", "Сидоренко", "Григорович", Human.Sex.MALE) {};
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department1 = departmentCreator.createDepartment("Кафедра програмної інженерії", departmentHead1);

        Human departmentHead2 = new Human("Наталія", "Павленко", "Євгенівна", Human.Sex.FEMALE) {};
        Department department2 = departmentCreator.createDepartment("Кафедра кібербезпеки", departmentHead2);

        facultyCreator.addDepartment(faculty1, department1);
        facultyCreator.addDepartment(faculty1, department2);

        // Додавання груп до кафедр
        Human groupHead1 = new Human("Дмитро", "Коваль", "Ігорович", Human.Sex.MALE) {};
        GroupCreator groupCreator = new GroupCreator();
        Group group1 = groupCreator.createGroup("Група IT-301", groupHead1);

        Human groupHead2 = new Human("Ольга", "Романенко", "Сергіївна", Human.Sex.FEMALE) {};
        Group group2 = groupCreator.createGroup("Група CB-302", groupHead2);

        departmentCreator.addGroup(department1, group1);
        departmentCreator.addGroup(department1, group2);

        // Додавання студентів до груп
        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("Максим", "Захарченко", "Борисович", Human.Sex.MALE, "IT301001");
        Student student2 = studentCreator.createStudent("Анна", "Литвин", "Миколаївна", Human.Sex.FEMALE, "IT301002");
        Student student3 = studentCreator.createStudent("Олег", "Мартинюк", "Вікторович", Human.Sex.MALE, "CB302001");
        Student student4 = studentCreator.createStudent("Юлія", "Шевченко", "Андріївна", Human.Sex.FEMALE, "CB302002");

        groupCreator.addStudent(group1, student1);
        groupCreator.addStudent(group1, student2);
        groupCreator.addStudent(group2, student3);
        groupCreator.addStudent(group2, student4);

        // Додавання факультету до університету
        universityCreator.addFaculty(university, faculty1);

        // Створення другого факультету
        Human facultyHead2 = new Human("Євген", "Гончаренко", "Степанович", Human.Sex.MALE) {};
        Faculty faculty2 = facultyCreator.createFaculty("Факультет математичних наук", facultyHead2);

        universityCreator.addFaculty(university, faculty2);

        // Вивід даних про університет
        System.out.println(university);
    }

    public static void begin() {
        createTypicalUniversity();
    }
}