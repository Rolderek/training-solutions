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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Add emg a vezeték neved:");
        String firstName = scanner.nextLine();

        System.out.println("Add meg a keresztneved:");
        String lastName = scanner.nextLine();

        System.out.println("Add meg az email címed:");
        String email = scanner.nextLine();
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Hibás az email cím!");
        }

        User user = new User(firstName, lastName, email);


        System.out.println(user.getFullName());
        System.out.println(user.email);

    }


}
