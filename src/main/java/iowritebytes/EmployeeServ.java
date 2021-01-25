package iowritebytes;

import javax.imageio.event.IIOWriteProgressListener;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeServ {

    public static void main(String[] args) {
        Path path = Path.of("datta.dat");
       try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
           for (int i = 0; i < 1100; i++) {
               os.write("abcde".getBytes());
           }

       }
       catch (IOException ioe) {
       throw new IllegalStateException("Can not write file.", ioe);
       }
    }
}
