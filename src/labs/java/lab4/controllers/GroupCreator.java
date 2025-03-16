package lab4.controllers;

import lab4.models.Group;
import lab4.models.Student;

import java.util.ArrayList;
import java.util.Random;

public class GroupCreator implements RandomCreator<Group> {

    @Override
    public Group createRandomly() {
        var studentCreator = new StudentCreator();
        var humanCreator = new HumanCreator();
        var students = new ArrayList<Student>();
        var random = new Random();

        var size = random.nextInt(5) + 3;

        for (int i = 0; i < size; i++) {
            students.add(studentCreator.createRandomly());
        }

        var group = new Group();
        group.students = students;
        group.name = "Group " + random.nextInt(5000);

        group.head = humanCreator.createRandomly();

        return group;
    }
}
