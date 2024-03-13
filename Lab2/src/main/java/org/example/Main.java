package org.example;

import org.example.entity.Grupa;
import org.example.entity.Person;
import org.example.entity.Student;

public class Main {
    public static void main(String[] args) {
        //A)
        Person person = new Person();
        Person person1 = new Person("Adrian", "Melnic");
        Person person2 = new Person("Vasile Lungu");

        //B)
        Student student = new Student("Ion","Rusu");

        //C)
        Grupa grupa1 = new Grupa("CR-221");
        Grupa grupa2 = new Grupa("CR-211");
        Student student1 = new Student("Gheorghe", "Bulai", grupa1, 2022);

        //D)
        Person personStudent = new Student("Ion", "Rotari", grupa2, 2021);

        System.out.println("\t\tApelul tuturor metodelor folosind toate obiectele clasei Person: ");

        System.out.println("\n\tObiectul 'person': ");
        person.displayFullName();
        person.displayFirstName();

        System.out.println("\n\tObiectul 'person1': ");
        person1.displayFullName();
        person1.displayFirstName();

        System.out.println("\n\tObiectul 'personStudent': ");
        personStudent.displayFullName();
        personStudent.displayFirstName();

        System.out.println("\n\tObiectul 'person2': ");
        person2.displayFullName();
        person2.displayFirstName();

        System.out.println("\t\t\nApelul tuturor metodelor folosind toate obiectele clasei Student: ");

        System.out.println("\n\tObiectul 'student': ");
        student.displayStudentInfo();
        student.displayFullName();
        student.displayFirstName();
        student.compareToOtherStudent(student1);

        System.out.println("\n\tObiectul 'student1': ");
        student1.displayStudentInfo();
        student1.displayFullName();
        student1.displayFirstName();
        student1.compareToOtherStudent(student1);

    }
}