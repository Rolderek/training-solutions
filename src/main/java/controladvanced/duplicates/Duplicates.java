package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {


        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(3);
        lista.add(4);

        System.out.println(lista);

            for (int i = 0; i <= lista.size(); i++) {
                System.out.println(lista.indexOf(i));
            }
        }
    }