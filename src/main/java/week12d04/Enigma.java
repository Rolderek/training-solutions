package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {

    //eredeti
    public void printSecret(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b: bytes) {
               char c = (char) (b + 10);
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }


/* stringbilderes
    public String printSecret2(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b: bytes) {
                char c = (char) (b + 10);
                sb.append(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
         String result = new Enigma().printSecret2(Path.of("secret.dat"));
        System.out.print(result);
    }

 */

    public String printSecret3(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)) {
            byte[] buffer = new byte[10];
            int size;
            while ((size = is.read(buffer)) > 0) {
                System.out.println(size);
                for (int i = 0; i < size; i++) {
                   char c = (char) (buffer[i] + 10);
                   sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String result = new Enigma().printSecret3(Path.of("secret.dat"));
        System.out.println(result);

    }
}
