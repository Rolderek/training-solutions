package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.*;

public class FileReader {

    private List<House> houses = new ArrayList<>();

    public FileReader(List<House> houses) {
        this.houses = houses;
    }

    public List<House> getHouses() {
        return houses;
    }

    public House findTheHouse() {
        House theHouse;
        String path = "C:\\training-solutions\\training-solution\\src\\main\\java\\week15d05\\olvasásra";
        String line;
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {
            while ((line = br.readLine()) != null) {
                List<String> value = Arrays.asList(line.split(","));
                List<String> houses = List.of(value.get(5), value.get(6), value.get(7), value.get(8), value.get(9), value.get(10), value.get(11), value.get(12));
                lineToList(houses);
                theHouse(houses);
            }
        } catch(IOException ioe){
            throw new IllegalArgumentException("File not found!", ioe);
        }
        House hh = new House(houses.toString());
        return hh;
        }

        public List<String> lineToList(List<String> houses) {
        List<String> házakhoz = new ArrayList<>();
        for (int i =0; i < houses.size(); i++) {
            if (houses.get(i) != null || houses.get(i).isEmpty()) {
                házakhoz.add(houses.get(i));
            }
        }
            System.out.println(házakhoz);
        return házakhoz;
        }

        public List<House> theHouse(List<String> házakhoz) {
            List<House> theOne = new ArrayList<>();
            House oneHouse = new House("");
            int count = 0;
            String name = "";
            for (int i = 0; i < házakhoz.size(); i++) {
                if (házakhoz.get(i) == null || házakhoz.get(i).isEmpty()) {
                }
                theOne.add(new House(házakhoz.get(i).toString()));
                List<House> copy = new ArrayList<>(theOne);
                for (int j = 0; j < copy.size(); j++) {
                }

            }
            System.out.println(theOne.toString());
            return theOne;
        }




    public static void main(String[] args) {
        FileReader fr = new FileReader(Arrays.asList(new House("akármi")));
        fr.findTheHouse();

    }

     //másé alul csak tanulmányozni

    public Map.Entry<String, Integer> mostIdiotsHouse(String fileName) {
        Map<String, Integer> idiots = new HashMap<>();
        InputStream is = FileReader.class.getResourceAsStream(fileName);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            br.readLine();
            processLine(idiots, br);
            return getMostIdiots(idiots);
        } catch (IOException ioe) {
            throw new IllegalStateException("No file", ioe);
        }
    }

    private void processLine(Map<String, Integer> result, BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            List<String> idiots = List.of(row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12]);
            for (String idiot : idiots) {
                if (!idiot.isEmpty()) {
                    fillMap(result, idiot);
                }
            }
        }
    }

    private Map.Entry<String, Integer> getMostIdiots(Map<String, Integer> idiots) {
        int value = Collections.max(idiots.values());
        Map.Entry<String, Integer> looser = null;
        for (Map.Entry<String, Integer> entry : idiots.entrySet()) {
            if (entry.getValue().equals(value)) {
                looser = entry;
            }
        }
        return looser;
    }

    private void fillMap(Map<String, Integer> result, String idiot) {
        if (!result.containsKey(idiot)) {
            result.put(idiot, 0);
        }
        result.replace(idiot, result.get(idiot) + 1);
    }

}
