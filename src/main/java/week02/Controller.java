package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány tárgyalót szeretnél megadni?");
        int meetingRoomNumbers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> MeetingRoom = new ArrayList<>() ;
        for (int i = 1; i <= meetingRoomNumbers; i++) {
            addMeetingRoom();
        }
        System.out.println();
    }



}

