package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    public void writeTemeratures(Temperatures temperatures, String pathString) {
        Path path = Path.of("temperature.data");
        try {
            Files.write(path, temperatures.getData());
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not write the file.", e);
        }
    }
}
