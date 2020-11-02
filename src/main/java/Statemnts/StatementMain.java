package Statemnts;

import java.beans.Statement;

public class StatementMain {

    public static void main(String[] args) {
        int i = 5 + 6;
        System.out.println(5 + 6);

        System.out.println("Hello" + i + "World");

        StatementMain s = new StatementMain();

        System.out.println(i = 8);

        System.out.println("aaa".equals("aaa"));
        System.out.println("aaa".equals("aa"));

        System.out.println(!(i % 2 == 0));
        System.out.println(!(i % 2 == 0) || true);

        i++;
        i = i + 1;
        System.out.println(i);

        System.out.println(i % 2 == 0 ? "páros" : "páratlan" );

    }
}
