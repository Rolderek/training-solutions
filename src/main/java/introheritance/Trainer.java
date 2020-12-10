package introheritance;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human {

    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public int getAge() {
        return super.getAge() - courses.size();
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
