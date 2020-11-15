package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Mark> marks = new ArrayList<>();

    private String name;

    public double calculateAverage() {
        double sumAverage = 0.0;
        for (Mark mark : marks) {
            sumAverage += mark.getMarkType().getValue();
        }
        return Math.round(sumAverage / marks.size() * 100) / 100.0;
    }
}

 /*   public calculateSubjectAverage() {
        double subAverage;
        for () {

        }
    }

  */

/*    public equals() {
        boolean e;
     }



    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
*/