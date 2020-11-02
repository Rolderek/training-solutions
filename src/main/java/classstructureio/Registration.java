package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Add meg a neved.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Add meg az emailcímed.");
        String email = scanner.nextLine();
        System.out.println("A neved: " + name);
        System.out.println("Az emailcímed: " + email);
    }

}
