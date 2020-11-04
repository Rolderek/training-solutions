package week02;
import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a telefon típusát:");
        String type = scanner.nextLine();

        System.out.println("Add meg az azonosító számát:");
        int mem = scanner.nextInt();
        scanner.hasNextLine();

        Phone phone1 = new Phone(type, mem);
        System.out.println(phone1.getType());
        System.out.println(phone1.getMem());



        System.out.println("Add meg a 2. telefon típusát:");
        String type2 = scanner.nextLine();

        System.out.println("Add meg az 2. azonosító számát:");
        int mem2 = scanner.nextInt();
        scanner.hasNextLine();

        Phone phone2 = new Phone(type2, mem2);
        System.out.println(phone2.getType());
        System.out.println(phone2.getMem());
    }
}



/*
 Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a telefon típusát:");
        String type = scanner.nextLine();
        System.out.println("Add meg az azonosító számát:");
        int mem = scanner.nextInt();
        scanner.hasNextLine();
        Phone phone = new  Phone();
 */