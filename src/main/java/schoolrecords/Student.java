package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Mark> marks = new ArrayList<>();

    private String name;

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        double sumAverage = 0.0;
        for (Mark mark : marks) {
            sumAverage += mark.getMarkType().getValue();
        }
        return Math.round(sumAverage / marks.size() * 100) / 100.0;
    }


    public double calculateSubjectAverage(Subject subject) {
        double markSum = 0.0;
        int markNum = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                markSum += mark.getMarkType().getValue();
                markNum++;
            }
        }
        return Math.round((markSum / markNum) * 100) / 100.0;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    @Override
    public String toString() {
        String messages = getName();
        for (int i = 0; i < marks.size(); i++) {
            messages += " marks: " + marks.get(i).getSubject().getSubjectName()
                    + ": " + marks.get(i).getMarkType().getDescription()
                    + "(" + marks.get(i).getMarkType().getValue() + ")";
        }
        return messages;
    }


}

