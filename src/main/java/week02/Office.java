package week02;

import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

        Scanner scanner = new Scanner(System.in);

        private List<MeetingRoom> meetingRoom = new ArrayList<>();

        public void addMeetingRoom(MeetingRoom meetingRoom) {
                this.meetingRoom.add(meetingRoom);
        }

        public void printNames() {
                for (MeetingRoom room: meetingRoom) {
                        System.out.println(room.getName());
                }
        }

        public void printNamesReverse() {
                for (int i = meetingRoom.size()-1; i >= 0; i--) {
                        System.out.println(meetingRoom.get(i).getName());
                }
        }

        public void printEventNames() {
                for (int i = 1; i < meetingRoom.size(); i = i + 2) {
                        System.out.println(meetingRoom.get(i).getName());
                }
        }

        public void printAreas() {
                int i = 0;
                for (MeetingRoom meetingRoom: meetingRoom) {
                        System.out.println("Tárgyaló neve: " + meetingRoom.getName() + ", Tárgyaló hossza: " + meetingRoom.getLength() + ", Trágyaló szélessége: " + meetingRoom.getWidth() + ", Tárgyaló területe: " + meetingRoom.getArea() + "m\u00B2.");
                }
        }

        public void printMeetingRoomsWithName(String name) {
                for (MeetingRoom meetingRoom : meetingRoom) {
                        if (meetingRoom.getName().toLowerCase().equals(name.toLowerCase())) {
                                System.out.println("Tárgyaló neve: " + meetingRoom.getName() + ", Tárgyaló hossza: " + meetingRoom.getLength() + ", Trágyaló szélessége: " + meetingRoom.getWidth() + ", Tárgyaló területe: " + meetingRoom.getArea() + "m\u00B2");
                        }
                }
        }

        public void printMeetingRoomsContains(String part) {
                boolean talalat = false;
                int i = 0;
                for (MeetingRoom meetingRoom : meetingRoom) {
                        if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                                System.out.println("Tárgyaló neve: " + meetingRoom.getName() + ", Tárgyaló hossza: " + meetingRoom.getLength() + ", Trágyaló szélessége: " + meetingRoom.getWidth() + ", Tárgyaló területe: " + meetingRoom.getArea() + "m\u00B2");
                                talalat = true; i++;
                        }
                }
                System.out.println(talalat ?  i + " Találat.": "Nem volt találat.");
        }

        public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRoom) {
                if(meetingRoom.getArea() > area) {
                        System.out.println("Tárgyaló neve: " + meetingRoom.getName() + ", Tárgyaló hossza: " + meetingRoom.getLength() + ", Trágyaló szélessége: " + meetingRoom.getWidth() + ", Tárgyaló területe: " + meetingRoom.getArea() + "m\u00B2");
                }
        }
        }
}