package recursion;

public class FactorialCalculator {
//kiszámolja az n szám faktoriálisát (nálánál kisebb egész számok szorzata)
    public long getFactorial(int number) {
        if (number > 1) {
            long solution = getFactorial(number - 1);
            return number * solution;
        }
        else {
            return 1;
        }
    }
}
