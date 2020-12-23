package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    List<Person> persons = new ArrayList<>();

    public List<Present> getThroughChimneys() {
        List<Present> presents = new ArrayList<>();
        for (Person person : persons) {
            presents.add(person.setPresent());
        }
        return presents;
    }

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }


}
