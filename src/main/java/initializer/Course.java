package initializer;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public static final List<Course> COURSE;

    static {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courses.add(new Course("Course" + i));
        }
        COURSE = courses;
    }

    private String name;

    public Course(String anme) { this.name = name; }

    public String getName() { return name; }
}
