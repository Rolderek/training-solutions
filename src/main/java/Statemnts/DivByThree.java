package Statemnts;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot.");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(i % 3 == 0 ? "Osztható hárommal" : "Nem osztható hárommal" );
    }
}

