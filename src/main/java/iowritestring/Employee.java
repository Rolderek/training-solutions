package iowritestring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Employee {

    public static void main(String[] args) {
        Path file = Path.of("iowritestringEmployees.txt");
        try {
        //Files.writeString(file, "John Doe", StandardOpenOption.APPEND);
        Files.write(file, List.of("John Doe", "Jane Doe"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }
}
