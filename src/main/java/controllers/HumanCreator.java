package controllers;

import models.Human;
import models.Sex;

import java.util.Random;

public class HumanCreator implements RandomCreator<Human> {

    @Override
    public Human createRandomly() {
        var human = new Human();
        var random = new Random();

        human.firstName = "random first name " + random.nextInt(1000000);
        human.lastName = "random last name " + random.nextInt(1000000);
        human.middleName = "random middle name " + random.nextInt(1000000);

        human.sex = random.nextDouble() > 0.5 ? Sex.Male : Sex.Female;

        return human;
    }
}
