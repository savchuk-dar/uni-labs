package models;

import java.util.List;
import java.util.Objects;

public class Department {
    public String name;
    public Human head;
    public List<Faculty> faculties;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var dep = (Department)obj;

        if (!Objects.equals(dep.name, name)) {
            return false;
        }

        if (!dep.head.equals(head)) {
            return false;
        }

        if (!dep.faculties.equals(faculties)) {
            return false;
        }

        return true;
    }
}
