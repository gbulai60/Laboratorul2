package org.example.entity;

public class Student extends Person {

    private Grupa group;

    private int year;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, Grupa group, int year) {
        super(firstName, lastName);
        this.group = group;
        this.year = year;
    }

    public void displayStudentInfo() {
        System.out.print("Student ");
        this.displayFullName();
        if (group != null) {
            group.displayGroupName();
        }
        System.out.println("Year: " + year);
    }

    @Override
    public void displayFullName() {
        super.displayFullName();
    }

    public int getYear() {
        return year;
    }

    public void compareToOtherStudent(Student other) {
        if (other != null) {
            if (this.year > other.getYear()) {
                System.out.println("Acest student este intr-un an mai mare!");
            } else if (this.year < other.getYear()) {
                System.out.println("Acest student este intr-un an mai mic!");
            } else if (this.year == other.getYear()) {
                System.out.println("Studentii sunt din acelasi an");
            }
        } else {
            System.out.println("Eroare! \nMetoda a primit un parametru null!");
        }
    }
}