package lab3.controllers;

import lab3.models.Department;
import lab3.models.University;

import java.util.ArrayList;
import java.util.Random;

public class UniversityCreator implements RandomCreator<University> {

    @Override
    public University createRandomly() {
        var departmentCreator = new DepartmentCreator();
        var humanCreator = new HumanCreator();
        var departments = new ArrayList<Department>();
        var random = new Random();

        var size = random.nextInt(3) + 2;

        for (int i = 0; i < size; i++) {
            departments.add(departmentCreator.createRandomly());
        }

        var university = new University();
        university.departments = departments;
        university.name = "University " + random.nextInt(10000);
        university.head = humanCreator.createRandomly();
        return university;
    }
}
