package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> o = new HashMap<>();

    public void readFromFile(BufferedReader r) {
        try (r) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] sep = line.split("=");
                o.put(sep[0], Integer.parseInt(sep[1]));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public Integer getNumberOfOwls(String country) {
        return o.get(country);
    }


/*
    private Map<String, Integer> oByC = new HashMap<>();

    public void readFromFile(BufferedReader reader) {
        try (reader) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.split("=");
                oByC.put(s[0], Integer.parseInt(s[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read file!", ioe);
        }
    }

    public int getNumberOfOwls(String country) {
        return getNumberOfOwls(country);
    }

 */
}
