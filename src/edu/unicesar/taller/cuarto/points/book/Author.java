package edu.unicesar.taller.cuarto.points.book;

import com.sun.xml.internal.ws.util.StringUtils;

public class Author {
    private String firstName;
    private String secondName;
    private String lastName;

    public Author() {
    }

    public String getFirstName() {
        return StringUtils.capitalize(firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return StringUtils.capitalize(secondName);
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return StringUtils.capitalize(lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
