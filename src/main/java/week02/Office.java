package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    Scanner scanner = new Scanner(System.in);

    private List<String>  MeetingRoom= new ArrayList<>();

    public void addMeetingRoom() {
        System.out.println("Add meg a tárgyaló nevét:");
        String name = scanner.nextLine();
        System.out.println("Add meg a tárgyaló hosszát:");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a tárgyaló szélességét:");
        int wigth = scanner.nextInt();
        scanner.nextLine();
        MeetingRoom meetingRoom = new MeetingRoom();
    }
}


