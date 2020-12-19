package week08d01;

import java.util.InputMismatchException;

public class Robot {

    private int x;
    private int y;
    private String input = "FFLLLLLBBBBJJJJJJJ";

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int move(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'F') {
                setX(i);
            }
            else if (input.charAt(i) == 'L') {
                 setX(i);
            }
            else if (input.charAt(i) == 'J') {
                setY(i);
            }
            else if (input.charAt(i) == 'B') {
                setX(i);
            }
            else {
                throw new IllegalArgumentException("Nincs ilyen utasítás")
            }
        }
    }
}
