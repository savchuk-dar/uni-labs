package org.example;

import controllers.UniversityCreator;
import models.University;

public class Run {

    public University createTypicalUniversity() {
        return new UniversityCreator().createRandomly();
    }
}
