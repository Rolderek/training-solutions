package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) { //bemeneti paraméterként vár egy readert
        StringBuilder result = new StringBuilder();
        try (reader) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line); // integerben olvassuk a sorokat
                for (int i = 1; i <= num; i++) {
                    result.append("*"); // ha i kisebb mint a szám akkor adjon hozzá egy csillagot
                }
                result.append("\n"); //mivel soronként van ezért mindne sor végéhez adjon hozzá sortörést
            }
            return result.toString(); // elkészült így rakja össze
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
