package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ClassRecords {

    private String className;

    private Random rnd;

    List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random rnd) {
        if (isEmpty(className)) {
            throw new NullPointerException("Class name must not be empty!");
        }
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
        for (Student student1 : students) {
            if (student1.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double studentsSum = 0.0;
        int studentNum = 0;
        for (Student student : students) {
            if (student.calculateAverage() > 0) {
                studentsSum += student.calculateAverage();
                studentNum++;
            } else {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
        return Math.round((studentsSum / studentNum) * 100) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double studentsSum = 0.0;
        int studentNum = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) > 0) {
                studentsSum += student.calculateSubjectAverage(subject);
                studentNum++;
            }
        }
        return Double.parseDouble(String.format(Locale.US, "%.2f", studentsSum/studentNum));
        //return Math.round((studentsSum / studentNum) * 100) / 100.0;
    }



    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0 ) {
            throw new IllegalStateException("No students to search!");
        }
        Student foundStudent = null;
        for (Student student : students) {
            if (name.toLowerCase().equals(student.getName().toLowerCase())) {
                foundStudent = student;
                break;
            }

        }
        if (foundStudent == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        } else {
            return foundStudent;
        }
    }

    public String listStudentNames() {
        String names = "";
        for (Student student : students) {
            names += student.getName() + ", ";
        }
        return names.substring(0, names.length() - 2);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student student : students) {
            studyResultByNames.add(new StudyResultByName(student.calculateAverage(), student.getName()));

        }
        return studyResultByNames;
    }

    public boolean removeStudent(Student student) {
        boolean found = false;
        for (Student student1 : students) {
            if (student1.getName().toLowerCase().equals(student.getName().toLowerCase())) {
                found = true;
                students.remove(students);
                break;
            }
        }
        return found;
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

}
