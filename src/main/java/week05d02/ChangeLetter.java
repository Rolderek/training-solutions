package week05d02;

import java.util.Scanner;

public class ChangeLetter {

    private static final String VOWELS_TO_CHANGE = "AEIOU";

    Scanner scanner = new Scanner(System.in);

    public static String changeVowels(String workWith) {
        String replace = "";
        for (int i = 0; i < workWith.length(); i++) {
            if (VOWELS_TO_CHANGE.indexOf(workWith.toUpperCase().charAt(i)) > -1) {
                replace += "*";
            } else  {
                replace += workWith.charAt(i);
            }

        }
        System.out.println(replace);
        return replace;
    }

    public static void main(String[] args) {
        changeVowels("ApacukaFundaluka");
    }
}
