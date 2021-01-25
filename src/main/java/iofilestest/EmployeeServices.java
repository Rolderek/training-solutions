package iofilestest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeServices {

public void writeEmployeesToFile(List<String> employees, Path file) {
    try (BufferedWriter write = Files.newBufferedWriter(file)) {
        for (String employee: employees) {
            write.write(employee + "\n");
        }
    }
    catch (IOException ioe) {
        throw new IllegalStateException("Can not write.", ioe);
    }
}
}
