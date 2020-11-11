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
    }
}
