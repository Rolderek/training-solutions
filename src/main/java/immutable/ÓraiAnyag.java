package immutable;

import java.util.ArrayList;
import java.util.List;

public class ÓraiAnyag {

    private final String name;
    private final int yearOfBirth;

    private final List<String> courses;

    public ÓraiAnyag(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = courses;
    }

    public List<String> getCourses() {
        //return courses;
        return new ArrayList<>(courses);
        //return List.copyOf(courses); ez UnsupportedOperationException-ilyet dob!
    }
}
