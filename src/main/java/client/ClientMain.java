package client;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az Ügyfél nevét:");
        String name = scanner.nextLine();

        System.out.println("Add meg a születési éved.");
        int year = scanner.nextInt();

        System.out.println("Add meg a címed.");
        String address = scanner.nextLine();

        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);







    }
}
