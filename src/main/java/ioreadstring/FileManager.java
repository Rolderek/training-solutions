package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path path;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String filePath) {
        //ezt loptam a megoldásból, de nagyon tetszik :D
        this.path = Path.of("name.txt");
    }

    public Path getPath() {
        return path;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void readFromFile() {
        //beolvassa a file-t és létrehozza a Human objektumokat
        try {
            List<String> readed = Files.readAllLines(path);
            for (String done: readed) {
                String separate[] = done.split(" ");
                Human human = new Human(separate[0], separate[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File can not read!", e);
        }
    }

}
