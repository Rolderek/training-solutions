package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    public List<Person> getPeople() {
        return people;
    }

    public List<Person> people;

    public void getThroughChimneys() {
        for (Person p : people) {
            p.setPresent();
        }
    }

    public SantaClaus(List<Person> persons) {
        this.people = persons;
    }


}
