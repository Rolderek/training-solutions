package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityOperations {

    public String findCityWithMaxLength(BufferedReader reader) {
        String maxCityName = "";
        try {
            String line;
            //reader.readLine(); // ezzel kiveszi az első sort
            skipHeader(reader);
            while ((line = reader.readLine()) != null) {
               //System.out.println(line);
                String[] parts = line.split(";");
                String name = parts[1];
                if (name.length() > maxCityName.length()) {
                    maxCityName = name;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        if (maxCityName.equals("")) {
            throw new IllegalStateException("No city found");
        }
        return maxCityName;
    }

    private void skipHeader(BufferedReader bf) throws IOException {
        //a metódus mögött lévo dobás mondja hogy ez ilyet adhat
        // és ahol meg van hívva itt lesz majd lekezelve,
        // atry-on kívül persze nem hívható meg
        bf.readLine();
    }

    public static void main(String[] args) {
        try (BufferedReader bf =
                     Files.newBufferedReader(Path.of("covid/iranyitoszamok-varosok-2021.csv"))) {
            String city = new CityOperations().findCityWithMaxLength(bf);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
