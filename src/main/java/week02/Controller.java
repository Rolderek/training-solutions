package week02;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Office office;

    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Válassz a fentebb felsorolt menüpontokból, írd be a számát.");
        int menuPont = scanner.nextInt();
        scanner.nextLine();

        if (menuPont == 1) {
            office.printNames();
        } else if (menuPont == 2) {
            office.printNamesReverse();
        } else if (menuPont == 3) {
            office.printEventNames();
        } else if (menuPont == 4) {
            office.printAreas();
        } else if (menuPont == 5) {
            System.out.println("A tárgyaló neve amit keresel:");
            String name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        } else if (menuPont == 6) {
            //System.out.println(printMeetingRoomsContains());
        } else if (menuPont == 7) {
            //System.out.println(printAreasLargerThan());
        } else System.out.println("Nemlétező menüpontot választottál, kérlek az alábbiakból váélassz:");
        //runMenu();
    }
    public void readOffice() {
        office = new Office();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány tárgyalót szeretnél megadni?");
        int meetingRoomNumbers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < meetingRoomNumbers; i++) {

            System.out.println("Add meg a tárgyaló nevét:");
            String name = scanner.nextLine();
            System.out.println("Add meg a tárgyaló hosszát:");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Add meg a tárgyaló szélességét:");
            int width = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }






    }


