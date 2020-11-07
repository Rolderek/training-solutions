package qualifier;

import java.util.Scanner;

public class QualifierMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        int inputNumber = scanner.nextInt();
        if (inputNumber > 100) {
            System.out.println("nagyobb mint 100");
        } else {
            System.out.println("száz vagy kisebb");
        }

    }
}
