package models;

import java.util.List;
import java.util.Objects;

public class University {
    public String name;
    public Human head;
    public List<Department> departments;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var uni = (University)obj;

        if (!Objects.equals(uni.name, name)) {
            return false;
        }

        if (!uni.head.equals(head)) {
            return false;
        }

        if (!uni.departments.equals(departments)) {
            return false;
        }

        return true;
    }
}
