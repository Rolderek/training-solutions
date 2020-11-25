package week05d02;

import schoolrecords.StudyResultByName;

import java.util.Scanner;

public class ChangeLetter {

    private static final String VOWELS_TO_CHANGE = "AEIOU";

    private static final String REPLACE = "*";


    Scanner scanner = new Scanner(System.in);

    public static String changeVowels(String workWith) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < workWith.length(); i++) {
            String k = workWith.substring(i, i + 1);
            if (VOWELS_TO_CHANGE.contains(k)) {
                builder.append(REPLACE);
            } else  {
                builder.append(k);
            }

        }
        System.out.println(builder);
        return builder.toString();
    }

    public static void main(String[] args) {
        changeVowels("ApacukaFundalukacocaloLa");
    }
}
