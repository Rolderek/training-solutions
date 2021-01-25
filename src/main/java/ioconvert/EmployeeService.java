package ioconvert;

import javax.imageio.event.IIOWriteProgressListener;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("dattaa.dat");
        try (PrintStream os = new PrintStream( new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.println("Jhon Doe");
            System.out.println();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write  file.", ioe);
        }
       /* Path path = Path.of("dattaa.dat");
        try (OutputStreamWriter os = new OutputStreamWriter( new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.write("Jhon Doe");
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write  file.", ioe);
        }

        */
    }
}
