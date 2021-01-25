package iozip;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeServic {

    public static void main(String[] args) {
        Path path = Path.of("dataa.zip");
        try (ZipOutputStream os = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.putNextEntry(new ZipEntry("dataa.dat"));
               for (int i = 0; i < 1100; i++) {
                   os.write("abcde".getBytes());
               }
        }
        catch (IOException ioe) {
        throw new IllegalStateException("Can not write file", ioe);
    }

    }
}

