package lab4.controllers;

import lab4.models.Department;
import lab4.models.Faculty;

import java.util.ArrayList;
import java.util.Random;

public class DepartmentCreator implements RandomCreator<Department> {

    @Override
    public Department createRandomly() {
        var facultyCreator = new FacultyCreator();
        var humanCreator = new HumanCreator();
        var faculties = new ArrayList<Faculty>();
        var random = new Random();

        var size = random.nextInt(5) + 1;

        for (int i = 0; i < size; i++) {
            faculties.add(facultyCreator.createRandomly());
        }

        var department = new Department();
        department.faculties = faculties;
        department.name = "Department " + random.nextInt(50000);
        department.head = humanCreator.createRandomly();
        return department;
    }
}
