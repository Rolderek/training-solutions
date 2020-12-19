package week08d01;

import java.util.InputMismatchException;

public class Robot {

    private Position pos = new Position(0, 0);

    private String input = "FFLLLLLBBBBJJJJJJJ";


    public Position move(String input) {
        for (int i = 0; i <input.length(); i++) {
            mouveOneStep(input.charAt(i));
        }
        return this.pos;
    }

    private void mouveOneStep(char letter) {
        switch (letter) {
            case 'F': {
                pos.increaseY();
                return;
            }
            case 'L': {
                pos.decreaseY();
                return;
            }
            case 'J': {
                pos.increaseX();
                return;
            }
            case 'B': {
                pos.decreaseX();
                return;
            }
            default:
                throw new IllegalArgumentException("Ismeretlen lépés!");
        }
    }

    public Position getPos() {
        return pos;
    }
}
