package ioreadbytes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("data.dat");
        try (InputStream inputStream = Files.newInputStream(path)) {
            //itt 100 volt a videóban de a fene se fog begépelni 1000 "a" betűt :D
            byte[] buffer = new byte[100];
            int size = 0;
            while ((size = inputStream.read(buffer)) > 0) {
                System.out.println(Arrays.toString(buffer));
                System.out.println(size);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
