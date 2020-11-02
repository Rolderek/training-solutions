package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        System.out.println("Add meg a nevet/termék nevet:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Termék ára?");
        int price = scanner.nextInt();
        Product product = new Product(name, price);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println("Add meg hogy mennyivel nő az ára.");
        int increaseP = scanner.nextInt();
        System.out.println("Add meg hogy mennyivel csökken az ára.");
        int decreaseP = scanner.nextInt();

        System.out.println(price + increaseP - decreaseP);

    }
}
