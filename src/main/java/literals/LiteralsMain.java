package literals;

public class LiteralsMain {



    public static void main(String[] args) {

//   ez ugye  nem jó     System.out.println(qutient.toString());

        double qutient = 3 / 4d;
        System.out.println(qutient);


        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = "title";
        System.out.println(word.toUpperCase());

        System.out.println(Integer.toBinaryString(1));
//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(3));
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(-2));
// csak próbáltam a logikáját a binálisnak
    }

}

