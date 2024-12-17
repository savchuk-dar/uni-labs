package lab3.main;

import lab3.controllers.UniversityCreator;
import lab3.models.University;

public class Run {

    public University createTypicalUniversity() {
        return new UniversityCreator().createRandomly();
    }
}
