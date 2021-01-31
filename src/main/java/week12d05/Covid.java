package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {

    public int wordCounter(String word, Path file) {
        try (BufferedReader bf = Files.newBufferedReader(file)) {
            String line;
            int counter = 0;
            while ((line = bf.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!", e);
        }
    }

    public int wordCounterInputStreammel(String word, BufferedReader reader) {
        try {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!", e);
        }
    }

    /*
    public static void main(String[] args) {
        Path file = Path.of("index.html");
        Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus", file));
        System.out.println(covid.wordCounter("biden", file));
        System.out.println(covid.wordCounter("trump", file));
    }

     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = Files.newBufferedReader(Path.of("index.html"));
            Covid covid = new Covid();
            System.out.println(covid.wordCounterInputStreammel("koronavírus", reader));
            reader = Files.newBufferedReader(Path.of("index.html"));
            System.out.println(covid.wordCounterInputStreammel("biden", reader));
            reader = Files.newBufferedReader(Path.of("index.html"));
            System.out.println(covid.wordCounterInputStreammel("trump", reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }

    }
}
