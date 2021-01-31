package week13d04;

import interfacedependencyinversion.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMeneger {

    public String merge(Path file, List<EmployeeWriteOut> employee) {
        String sablon;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            sablon = reader.readLine();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file.", ioe);
        }
        return createString(sablon, employee);
    }

    private String createString(String sablon, List<EmployeeWriteOut> employee) {
        StringBuilder str = new StringBuilder();
        for (EmployeeWriteOut employeeWriteOut : employee) {
            String name = employeeWriteOut.getName();
            String yearOfBirth = String.valueOf(employeeWriteOut.getYearOfBirth());
            String employeeString = sablon.replace("{nev}", name).replace("{ev}", yearOfBirth);
            str.append(employeeString).append("\n");
        }
        return str.toString();
    }
}
