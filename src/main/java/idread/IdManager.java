package idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private String file;

    public IdManager(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    List<String> idList = new ArrayList<>();

    public List<String> readIdsFromFile(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("idnumbers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                idList.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
        return idList;
    }

    public static void main(String[] args) {
        IdManager idm = new IdManager("idnumbers.txt");

        System.out.println(idm.readIdsFromFile(idm.getFile()).toString());
    }
}
