package iodatastream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeSer {

    public static void main(String[] args) {
        Path path = Path.of("daata.dat");
        try (DataOutputStream os = new DataOutputStream( new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.writeUTF("Jhon Doe");
            os.writeInt(200_000);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }

        try (DataInputStream is = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
            String name = is.readUTF();
            int salary = is.readInt();
            System.out.println(name + " " + salary);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
}
