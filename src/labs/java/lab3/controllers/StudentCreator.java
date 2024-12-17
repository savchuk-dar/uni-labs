package lab3.controllers;

import lab3.models.Student;

public class StudentCreator implements RandomCreator<Student> {

    @Override
    public Student createRandomly() {
        var humanCreator = new HumanCreator();

        var human = humanCreator.createRandomly();

        var student = new Student();

        student.firstName = human.firstName;
        student.lastName = human.lastName;
        student.middleName = human.middleName;
        student.sex = human.sex;

        return student;
    }
}
