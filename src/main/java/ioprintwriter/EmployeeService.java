package ioprintwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {


        Path file = Path.of("employees.txt");

        List<String> employees = List.of("János Kis", "László Nagy", "Marika Horvát");

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String employee : employees) {
                writer.print(employee);
                writer.print(", ");
                writer.println(200_000);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }
    }
}
