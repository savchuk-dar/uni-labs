package lab4.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab4.models.University;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonManager {

    public void serializeUniversity(University university, Path filepath) throws IOException {
        var objectMapper = new ObjectMapper();
        Files.writeString(filepath, objectMapper.writeValueAsString(university));
    }

    public University deserializeUniversity(Path filepath) throws IOException {
        var objectMapper = new ObjectMapper();
        var content = Files.readString(filepath);
        return objectMapper.readValue(content, University.class);
    }
}
