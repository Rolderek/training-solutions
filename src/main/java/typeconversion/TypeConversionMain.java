package typeconversion;

public class TypeConversionMain {

    public static void main(String[] args) {
        int i = 5;
        long l = 500;
        float f = l;
        double d = 10.1;

        i = (int) l;
        System.out.println(i);
        i = (int) d;
        System.out.println(i);
    }
}
