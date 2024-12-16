package models;

import controllers.UniversityCreator;
import org.example.JsonManager;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class UniversityTest {
    private static final String FILE_PATH = "university.json";

    @Test
    public void testJsonUniversity() throws IOException {
        var universityCreator = new UniversityCreator();
        var jsonManager = new JsonManager();

        var oldUniversity = universityCreator.createRandomly();
        jsonManager.serializeUniversity(oldUniversity, Paths.get(FILE_PATH));
        var newUniversity = jsonManager.deserializeUniversity(Paths.get(FILE_PATH));

        assertEquals(oldUniversity, newUniversity);
    }
}