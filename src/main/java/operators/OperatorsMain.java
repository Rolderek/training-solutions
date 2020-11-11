package operators;

public class OperatorsMain {

    public static void main(String[] args) {
       /* System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(9 << 1));
        System.out.println(Integer.toBinaryString(9 >> 1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >> 1));
// itt mindig a bal karakterrel megeggyező karakter lép be
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >>> 1));
        // itt mindig nulla lép be
*/
        int i;
        int j;
        j = (i = 5);

        Operators operators = new Operators();


       // System.out.println(true || (1/0 == 0));

        System.out.println(operators.isEven(20));


        System.out.println(Integer.toBinaryString(100));

        System.out.println(16 >> 1); //ez az osztom kettővel
        System.out.println(16 << 1); //ez a szorzom kettővel
        System.out.println(13 >> 1); //ugyan az csak kerekítve
        System.out.println(13 << 1);
    }

}
