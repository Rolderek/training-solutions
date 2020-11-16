package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Song song = new Song();


        System.out.println("Add meg a kedvenc zeneszámod, először az előadó nevét:");
        song.band = scanner.nextLine();

        System.out.println("Add meg a zeneszám címét:");
        song.title = scanner.nextLine();

        System.out.println("Add meg a zeneszám hosszát percben:");
        song.length = scanner.nextLine() + "perc";

        System.out.println(song.band + "-" + song.title + "(" + song.length);

    }
}
