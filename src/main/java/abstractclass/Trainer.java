package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human {

    public Trainer(String name, int age, List<Course> courses) {
        super (name, age);
        this.courses = courses;
    }

    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses() {
        this.courses = courses;
    }

    /*@Override
    public int getFreeTime() {
        return super.getFreeTime() - courses.size();
    }

     */

    @Override
    public void work() {
        for (Course course : courses) {
            take(course);
        }
    }

    private void take(Course course) {
        //
    }
}
