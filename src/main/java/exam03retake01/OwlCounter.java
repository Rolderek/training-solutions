package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> o = new HashMap<>();
    Path file = Path.of("owls.txt");

    public void readFromFile() {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sep = line.split("=");
                o.put(sep[0], Integer.parseInt(sep[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public Integer getNumberOfOwls(String country) {
        return o.get(country);
    }
}
