package org.example.entity;

public class Person {

    private final String firstName;

    private final String lastName;

    public Person() {
        this("Unknown", "Unknown");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String fullName) {
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public void displayFullName() {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    public void displayFirstName(){
        System.out.println("First name: " + firstName);
    }



}
