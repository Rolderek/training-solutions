package week12d01;

/*
Mai junior/medior feladat:
Készíts egy GradeRounder osztályt, amiben van egy int[] roundGrades(int[] grades) metódus.
A grades tömb pontszámokat tartalmaz 0 és 100 között.
A feladat az, hogy kerekítsük a benne lévő számokat a következő szabály szerint:
Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3,
akkor kerekítsük fel a számot az 5 következő többszörösére.
Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket egyáltalán nem kell kerekíteni.
Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.
 */

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


    public int[] rounderGradesMasodik(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {

            }
        }
        return grades;
    }

}
