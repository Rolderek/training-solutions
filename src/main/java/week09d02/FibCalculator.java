package week09d02;


public class FibCalculator {

   static long sumEvens(int bound) {
       int sum = 0;
       int fibN = 0;
       while (fib(fibN) < bound) {
           if (FIB_NUMS[fibN] % 2 == 0) {
               sum += FIB_NUMS[fibN];
           }
           fibN++;
       }
       return sum;
   }

    private static int[] FIB_NUMS = new int[1000];

    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    static int fib(int n) {
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            if (FIB_NUMS[n] == 0) {
            } return fib(n) + fib(n - 2);
            }
        }
    }
    /*public long sumEvens(int bound) {
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


     */


