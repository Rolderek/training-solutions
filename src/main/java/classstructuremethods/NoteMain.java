package classstructuremethods;

import java.util.Scanner;

public class NoteMain {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Note note = new Note();

       note.setName("Szerző");
       note.setTopic("Lótartás");
       note.setText("Egyszer volt hol nem volt, élt egy ló...");



        System.out.println(note.getNoteText());


    }
}
