package week05d05;

import week05d04.Product;

import java.util.Scanner;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Add emg a vezeték neved:");
        String firstName = scanner.nextLine();

        System.out.println("Add meg a keresztneved:");
        String lastName = scanner.nextLine();

        System.out.println("Add meg az email címed:");
        String email = scanner.nextLine();
        if (email.contains("@")) {
            System.out.println("Létező emailcímet adtál meg.");
        } else {
            System.out.println("Helytelken az email cím!");
        }

        User user = new User(firstName, lastName, email);

        System.out.println(user.toString());
        System.out.println(user.firstName);
        System.out.println(user.lastName);
        System.out.println(user.email);

    }


}
