package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Human {
    public String firstName;
    public String lastName;
    public String middleName;
    public Sex sex;

    @JsonIgnore
    public String getFormatted() {
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var human = (Human)obj;

        if (!Objects.equals(human.firstName, firstName)) {
            return false;
        }

        if (!Objects.equals(human.lastName, lastName)) {
            return false;
        }

        if (!Objects.equals(human.middleName, middleName)) {
            return false;
        }

        return human.sex == sex;
    }
}
