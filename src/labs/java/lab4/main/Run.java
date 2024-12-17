package lab4.main;

import lab4.controllers.UniversityCreator;
import lab4.models.University;

public class Run {

    public University createTypicalUniversity() {
        return new UniversityCreator().createRandomly();
    }
}
