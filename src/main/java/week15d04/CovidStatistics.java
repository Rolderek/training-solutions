package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//van ahol szarakszik!!! át kell nézni!

public class CovidStatistics {

    private List<String> cases = new ArrayList<>();

    public void readFromFile(BufferedReader br) {
        try{
           String line;
           br.readLine();
           while ((line = br.readLine()) != null) {
               if (line.contains(",Hungary,")) {
                 // cases.add(processLine(line));
               }
           }
        } catch (IOException e) {
            throw new IllegalArgumentException("Fail at reading!", e);
        }
    }



    private CovidCaseByWeek processLine(String line) {
        String[] temp = line.split(",");
        int numberOfCases = Integer.parseInt(temp[2]);
        return new CovidCaseByWeek(temp[1], numberOfCases);
    }

    /*
    public List<CovidCaseByWeek> getCaces() {
        return new ArrayList<>(cases);
    }

     */



    public static void main(String[] args) {
        try (BufferedReader dr = Files.newBufferedReader(Path.of("data.csv"))) {
            CovidStatistics covidStatistics = new CovidStatistics();
            covidStatistics.readFromFile(dr);
        }
        catch (IOException e) {
            throw new IllegalStateException("nem jó", e);
        }
    }
}
