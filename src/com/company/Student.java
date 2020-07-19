package com.company;


public class Student extends Person {

    private boolean hasPreviousJavaExperience;
    private Group group;

    @Override
    public String toString() {
        return "Student{" +
                "cnp=" + getCnp() +
                ",firstName=" + getFirstName() +
                ",lastName=" + getLastName() +
                ",hasPreviousJavaExperience=" + hasPreviousJavaExperience +
                "} ";
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean isHasPreviousJavaExperience() {
        return hasPreviousJavaExperience;
    }

    public void setHasPreviousJavaExperience(boolean hasPreviousJavaExperience) {
        this.hasPreviousJavaExperience = hasPreviousJavaExperience;
    }
}
