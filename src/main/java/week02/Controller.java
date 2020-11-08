package week02;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Office office;


    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
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

    public void printMenu() {

    }

    public void runMenu() {

    }
}

