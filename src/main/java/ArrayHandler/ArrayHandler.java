package ArrayHandler;

public class ArrayHandler {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int item: a) {
            System.out.println(item);
        }
    }
}
