package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] dayName = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(dayName[1]);
        System.out.println(dayName.length);


        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }

        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.print(powersOfTwo[i] + " " );
        }

        System.out.println();

        boolean[] tf = new boolean[6];
        for (int i = 1; i < tf.length; i++) {
            tf[i] = tf[i - 1];
        }
        for (int i = 0; i < tf.length; i++) {
            System.out.print(tf[i] + " ");
        }
        System.out.println();

    }
}








