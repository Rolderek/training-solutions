package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Add meg a neved:");
        client.name = scanner.nextLine();

        System.out.println("Add emg a születési éved:");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add meg a címedet:");
        client.address = scanner.nextLine();

        System.out.println("Ezeket adtad meg:");
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }
}
