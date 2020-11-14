package controliteration.pi;

public class Pi {

    private static final String PiVers = "Nem a régi s durva közelítés,\n" +
            "Mi szótól szóig így kijön\n" +
            "Betűiket számlálva.\n" +
            "Ludolph eredménye már,\n" +
            "Ha itt végezzük húsz jegyen.\n" +
            "De rendre kijő még tíz pontosan,\n" +
            "Azt is bízvást ígérhetem.\n" +
            "\t";

    public static final String DECIMAL_SEPARATOR = ".";

    public String getPi() {
        String s = "";
        int counter = 0;
        for (int i = 0; i < PiVers.length(); i++) {
            if (counter != 0 && !Character.isAlphabetic(PiVers.charAt(i))) {
                s += counter;
                if (s.length() == 1) {
                    s += DECIMAL_SEPARATOR;
                }
                counter = 0;
            }
            if (Character.isAlphabetic(PiVers.charAt(i))) {
                counter ++;
            }
        }
        return s;
    }


    public static void main(String[] args) {
        int number = 5;
        while(number < 20) {
            number += 3;
            System.out.println(number);
        }
    }

}
