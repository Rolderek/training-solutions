package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első számot amit össze szerenél adni:");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add meg a második számot:");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        int sumNumber = number1 + number2;

        System.out.println(number1 + " + " + number2 + "!");
        System.out.println("(" + sumNumber + ")!");
    }

}
