package methodstructure;

import enumtype.Coin;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void addCourse(String name) {
        courses.add(new Course(name));
        return; // meg lehet hívni paraméter nélkül
    }

    public Course findCourseByName(String name) {
        for (Course course: courses) {
            if (course.getName().equals("name")) {
                return course;// itt nem túl szerencsés elhelyezni a return-t
            }
        }
        throw new IllegalArgumentException("Not found with name: " +name);
    }

    public List<Course> findCoursesBetween(char start, char end) {
        List<Course> courses = new ArrayList<>();
        for (Course course: this.courses) { // ha nincs itt a this akkor hibára fut mert nincs elmondva neki hogy melyik
            if (course.getName().toLowerCase().charAt(0) >= start && course.getName().toLowerCase().charAt(0) <= end) {
                courses.add(course);
            }
        }
        return courses;
    }
}
