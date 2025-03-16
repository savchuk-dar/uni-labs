package lab4.models;

import java.util.List;
import java.util.Objects;

public class Group {
    public String name;
    public Human head;
    public List<Student> students;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var group = (Group)obj;

        if (!Objects.equals(group.name, name)) {
            return false;
        }

        if (!group.head.equals(head)) {
            return false;
        }

        if (!group.students.equals(students)) {
            return false;
        }

        return true;
    }
}
