package methodvarargs;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer(String name) {
        courses.add(new Course(name));
    }

    public String getName() {
        return name;
    }

    public void addCourse(String name) {
        courses.add(new Course(name));
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(List<String> names) {
        for (String name: names) {
            courses.add(new Course(name));
        }
    }
}
