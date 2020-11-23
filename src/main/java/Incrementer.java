import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Incrementer {

    public boolean isValidNumber(String number) {
        try {
            int value = Integer.parseInt(number);
            if (value < 0 && value > 10) {
                return true;
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println();
    }
}