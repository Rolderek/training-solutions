package week05d02;

import java.util.Scanner;

public class ChangeLetter {

    private static final String VOWELS_TO_CHANGE = "AEIOU";

    Scanner scanner = new Scanner(System.in);

    public static String changeVowels(String workWith) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < workWith.length(); i++) {
            if (VOWELS_TO_CHANGE.indexOf(workWith.toUpperCase().charAt(i)) > -1) {
                builder.append("*");
            } else  {
                builder.append(workWith.substring(i,i+1));
            }

        }
        System.out.println(builder);
        return builder.toString();
    }

    public static void main(String[] args) {
        changeVowels("ApacukaFundalukacocaloLa");
    }
}
