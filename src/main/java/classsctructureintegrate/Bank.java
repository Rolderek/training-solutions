package classsctructureintegrate;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a számlanyitó nevét.");
        String owner = scanner.nextLine();

        System.out.println("Adja meg a számlaszámot.");
        String accountNumber = scanner.nextLine();

        System.out.println("Adja mega  nyitó egyenleget.");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount1 = new BankAccount(owner, accountNumber, balance);
        System.out.println(bankAccount1.getInfo());


        System.out.println("Adja meg a 2. számlanyitó nevét.");
        String owner2 = scanner.nextLine();


        System.out.println("Adja meg a 2. számlaszámot.");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Adja meg a 2. nyitó egyenleget.");
        int balance2 = scanner.nextInt();

        BankAccount bankAccount2 = new BankAccount(owner2, accountNumber2, balance2);
        System.out.println(bankAccount2.getInfo());

    }
}