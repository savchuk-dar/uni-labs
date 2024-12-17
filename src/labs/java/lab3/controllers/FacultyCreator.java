package lab3.controllers;

import lab3.models.Faculty;
import lab3.models.Group;

import java.util.ArrayList;
import java.util.Random;

public class FacultyCreator implements RandomCreator<Faculty> {

    @Override
    public Faculty createRandomly() {
        var groupCreator = new GroupCreator();
        var humanCreator = new HumanCreator();
        var groups = new ArrayList<Group>();
        var random = new Random();

        var size = random.nextInt(6) + 2;

        for (int i = 0; i < size; i++) {
            groups.add(groupCreator.createRandomly());
        }

        var faculty = new Faculty();
        faculty.groups = groups;
        faculty.name = "Faculty " + random.nextInt(90000);
        faculty.head = humanCreator.createRandomly();
        return faculty;
    }
}
