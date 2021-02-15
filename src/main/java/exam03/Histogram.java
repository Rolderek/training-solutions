package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder result = new StringBuilder();
        try (reader) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                for (int i = 1; i <= num; i++) {
                    result.append("*");
                }
                result.append("\n");
            }
            return result.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }

}
