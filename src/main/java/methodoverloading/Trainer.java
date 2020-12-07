package methodoverloading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Trainer {

    private String name;

    private int age;

    private List<Course> courses = new ArrayList<>();

    public void addCourse(String name) {
        courses.add(new Course(name));
    }

    public boolean addCourse(String name, int index ) {
        courses.add(index, new Course(name));
        return true;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }


}
