package week11d01;

public class DivisorFinder {

    //Enikő megoldása óráról
    public int findDivisior(int n) {
        n = Math.abs(n);
        int sum = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(number.substring(i, i+1));
            //substring helyett number.charArray és tömb lesz belőle amin végig lehet menni
            if (n % x == 0) {
                sum++;
            }
        }
        return sum;
    }


}
