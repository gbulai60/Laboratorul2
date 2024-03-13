package org.example.entity;

public class Grupa {

    private final String groupName;

    public Grupa(String groupName) {
        this.groupName = groupName;
    }

    void displayGroupName() {
        System.out.println("Group: " + groupName);
    }
}