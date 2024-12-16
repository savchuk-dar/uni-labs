package models;

import java.util.List;
import java.util.Objects;

public class Faculty {
    public String name;
    public Human head;
    public List<Group> groups;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var fac = (Faculty)obj;

        if (!Objects.equals(fac.name, name)) {
            return false;
        }

        if (!fac.head.equals(head)) {
            return false;
        }

        if (!fac.groups.equals(groups)) {
            return false;
        }

        return true;
    }
}
