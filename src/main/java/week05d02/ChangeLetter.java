package week05d02;

import schoolrecords.StudyResultByName;

import java.util.Scanner;

public class ChangeLetter {

    private static final String VOWELS_TO_CHANGE = "aeiuo";

    private static final String REPLACE = "*";




    public static String changeVowels(String workWith) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < workWith.toLowerCase().length(); i++) {
            String k = workWith.substring(i, i + 1);
            if (VOWELS_TO_CHANGE.toLowerCase().contains(k)) {
                builder.append(REPLACE);
            } else  {
                builder.append(k);
            }

        }
        System.out.println(builder.toString().toLowerCase());
        return builder.toString().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        changeVowels("apacukafundalukacocalola");

        System.out.println("adj meg egy szöveget:");
        String workWithTo = scanner.nextLine();
        changeVowels(workWithTo.toLowerCase());
    }
}
