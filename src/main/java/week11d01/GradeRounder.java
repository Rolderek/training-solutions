package week11d01;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class GradeRounder {



    public static void main(String[] args) {
        int[] result = new GradeRounder().roundGrades(new int []{34, 84, 22});
        System.out.println(Arrays.toString(result));
    }

    public int[] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                int actualNum = grades[i] / 5;
                int next = (actualNum + 1) * 5;
                if (next - grades[i] < 3) {
                    grades[i] = next;
                }
            }
        }
        return grades;
    }
}
