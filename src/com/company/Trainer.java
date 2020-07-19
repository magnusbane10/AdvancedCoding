package com.company;

import java.util.Date;

public class Trainer extends Person {

    private boolean authorised;
    private Group group;

    @Override
    public String toString() {
        return "Trainer{" +
                "cnp=" + getCnp() +
                ",firstName=" + getFirstName() +
                ",authorised=" + authorised +
                "} ";
    }

    public boolean isAuthorised() {
        return authorised;
    }

    public void setAuthorised(boolean authorised) {
        this.authorised = authorised;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
