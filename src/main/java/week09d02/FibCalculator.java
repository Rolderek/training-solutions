package week09d02;

public class FibCalculator {

    public long sumEvens(int bound) {
        long sum = 0;
        long a = 0;
        long b = 0;
        long d;

        while (bound > sum + a) {
            d = a + b;
            a = b;
            b = d;
            if (d%2 == 0) {
                sum +=d;
            }
        }
        return sum;
    }


}
