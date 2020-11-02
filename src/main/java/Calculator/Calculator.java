package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Adj meg egy számot.");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Adj meg még egy számot.");
        int number2 = scanner.nextInt();
        System.out.println( number1 + number2);
    }

}