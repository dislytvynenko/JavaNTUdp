package org.java.lab4.Test;

import org.java.lab4.JSON.JSONManager;
import org.java.lab4.Model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    @Test
    public void testJsonSerialization() throws IOException {
        University oldUniversity = new University("Головний Університет", new Student("Олександр", "Коваль", "Ігорович", Human.Sex.MALE, "S200"));

        Faculty faculty1 = new Faculty("Факультет Технологій", new Student("Марко", "Іваненко", "Олексійович", Human.Sex.MALE, "S201"));
        Faculty faculty2 = new Faculty("Факультет Літератури", new Student("Катерина", "Сидоренко", "Олександрівна", Human.Sex.FEMALE, "S202"));

        Department department11 = new Department("Інформаційні Технології", new Student("Ольга", "Мельник", "Артемівна", Human.Sex.FEMALE, "S203"));
        Department department12 = new Department("Штучний Інтелект", new Student("Андрій", "Шевченко", "Віталійович", Human.Sex.MALE, "S204"));
        Department department21 = new Department("Літературна Критика", new Student("Марія", "Зайцева", "Іванівна", Human.Sex.FEMALE, "S205"));
        Department department22 = new Department("Світова Література", new Student("Володимир", "Гончаренко", "Сергійович", Human.Sex.MALE, "S206"));

        Group group111 = new Group("ТК-201", new Student("Олексій", "Бондар", "Дмитрович", Human.Sex.MALE, "S207"));
        Group group112 = new Group("ТК-202", new Student("Людмила", "Кравець", "Петрівна", Human.Sex.FEMALE, "S208"));
        Group group121 = new Group("ТК-203", new Student("Ігор", "Дмитренко", "Романович", Human.Sex.MALE, "S209"));
        Group group122 = new Group("ТК-204", new Student("Наталя", "Соловйова", "Євгенівна", Human.Sex.FEMALE, "S210"));
        Group group211 = new Group("ЛТ-301", new Student("Денис", "Рибак", "Георгійович", Human.Sex.MALE, "S211"));
        Group group212 = new Group("ЛТ-302", new Student("Анастасія", "Мартинюк", "Валеріївна", Human.Sex.FEMALE, "S212"));
        Group group221 = new Group("ЛТ-303", new Student("Тимофій", "Гаврилюк", "Максимович", Human.Sex.MALE, "S213"));
        Group group222 = new Group("ЛТ-304", new Student("Дарина", "Кушнір", "Богданівна", Human.Sex.FEMALE, "S214"));

        group111.addStudent(new Student("Артем", "Петренко", "Ігоревич", Human.Sex.MALE, "S215"));
        group111.addStudent(new Student("Аліна", "Бондаренко", "Олександрівна", Human.Sex.FEMALE, "S216"));
        group112.addStudent(new Student("Максим", "Кузьменко", "Дмитрович", Human.Sex.MALE, "S217"));
        group112.addStudent(new Student("Марія", "Смирнова", "Василівна", Human.Sex.FEMALE, "S218"));
        group121.addStudent(new Student("Дмитро", "Шевчук", "Миколайович", Human.Sex.MALE, "S219"));
        group121.addStudent(new Student("Ірина", "Тимошенко", "Іванівна", Human.Sex.FEMALE, "S220"));
        group122.addStudent(new Student("Арсен", "Бабенко", "Степанович", Human.Sex.MALE, "S221"));
        group122.addStudent(new Student("Валерія", "Гриценко", "Анатоліївна", Human.Sex.FEMALE, "S222"));
        group211.addStudent(new Student("Микола", "Чорномаз", "Олексійович", Human.Sex.MALE, "S223"));
        group211.addStudent(new Student("Наталія", "Іванова", "Миколаївна", Human.Sex.FEMALE, "S224"));
        group212.addStudent(new Student("Роман", "Зайцев", "Вікторович", Human.Sex.MALE, "S225"));
        group212.addStudent(new Student("Олена", "Федорова", "Ігорівна", Human.Sex.FEMALE, "S226"));
        group221.addStudent(new Student("Георгій", "Петров", "Петрович", Human.Sex.MALE, "S227"));
        group221.addStudent(new Student("Маргарита", "Дмитренко", "Федорівна", Human.Sex.FEMALE, "S228"));
        group222.addStudent(new Student("Тимур", "Гордієнко", "Михайлович", Human.Sex.MALE, "S229"));
        group222.addStudent(new Student("Світлана", "Соколова", "Володимирівна", Human.Sex.FEMALE, "S230"));

        department11.addGroup(group111);
        department11.addGroup(group112);
        department12.addGroup(group121);
        department12.addGroup(group122);
        department21.addGroup(group211);
        department21.addGroup(group212);
        department22.addGroup(group221);
        department22.addGroup(group222);

        faculty1.addDepartment(department11);
        faculty1.addDepartment(department12);
        faculty2.addDepartment(department21);
        faculty2.addDepartment(department22);

        oldUniversity.addFaculty(faculty1);
        oldUniversity.addFaculty(faculty2);

        JSONManager.saveToFile(oldUniversity, "university.json");
        University newUniversity = JSONManager.loadFromFile("university.json");

        System.out.println("Чи однакові університети? " + oldUniversity.equals(newUniversity));
        assertEquals(oldUniversity, newUniversity);
    }
}
